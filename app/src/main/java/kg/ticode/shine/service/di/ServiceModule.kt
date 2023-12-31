package kg.ticode.shine.service.di

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kg.ticode.shine.BuildConfig
import kg.ticode.shine.service.AuthService
import kg.ticode.shine.service.CarService
import kg.ticode.shine.service.MediaService
import kg.ticode.shine.service.UserService
import kg.ticode.shine.utils.AppAuth
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object ServiceModule {
    @Provides
    @Singleton
    fun provideLoggingInterceptor(): HttpLoggingInterceptor = HttpLoggingInterceptor().apply {
        if (BuildConfig.DEBUG) {
            level = HttpLoggingInterceptor.Level.BODY
        }
    }

    @Provides
    @Singleton
    fun provideHttpClient(
        httpLoggingInterceptor: HttpLoggingInterceptor,
        appAuth: AppAuth
    ): OkHttpClient =
        OkHttpClient.Builder()
            .connectTimeout(30, TimeUnit.SECONDS)
            .readTimeout(30, TimeUnit.SECONDS)
            .writeTimeout(30, TimeUnit.SECONDS)
            .addInterceptor(httpLoggingInterceptor)
            .addInterceptor { chain ->
                val request = appAuth.authStateFlow.value?.jwtToken?.let {
                    chain.request().newBuilder().addHeader("Authorization", it).build()
                } ?: chain.request()
                chain.proceed(request)
            }.build()

    @Provides
    @Singleton
    fun provideRetrofit(httpClient: OkHttpClient): Retrofit {
        val gsonBuilder = GsonBuilder()
        gsonBuilder.setLenient()
        val gson: Gson = gsonBuilder.create()
        return Retrofit.Builder().baseUrl(BuildConfig.BASE_URL).client(httpClient)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()
    }

    @Provides
    @Singleton
    fun provideAuthService(retrofit: Retrofit): AuthService = retrofit.create()

    @Provides
    @Singleton
    fun provideCarService(retrofit: Retrofit): CarService =  retrofit.create()

    @Provides
    @Singleton
    fun provideMediaService(retrofit: Retrofit): MediaService =  retrofit.create()

    @Provides
    @Singleton
    fun provideUserService(retrofit: Retrofit): UserService =  retrofit.create()
}