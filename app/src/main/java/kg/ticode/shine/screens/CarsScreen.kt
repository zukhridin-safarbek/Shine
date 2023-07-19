package kg.ticode.shine.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberAsyncImagePainter
import kg.ticode.shine.dto.CarResponse
import kg.ticode.shine.enums.CarsCategory
import kg.ticode.shine.enums.CarsStatus
import kg.ticode.shine.enums.Cities
import kg.ticode.shine.utils.CustomConstants

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CarsScreen() {
    val filter by remember {
        mutableStateOf<String?>("")
    }
    val cars = listOf(
        CarResponse(
            "Есть",
            "Доступен",
            "Минивен",
            "BMW",
            CarsStatus.VIP,
            CarsCategory.PASSENGERCAR,
            Cities.BATKEN,
            "Белый",
            "Нормальный",
            "Да",
            "7/14/2023",
            "Машина на ходу",
            "Передний",
            "5.5",
            "Нет",
            1L,
            "https://1gai.ru/uploads/posts/2018-06/1528215882_1-2.jpg",
            "20000",
            "X5",
            1500000.0,
            "Баткен",
            "Левый",
            "Автомат",
            2023
        ),
        CarResponse(
            "Есть",
            "Доступен",
            "Минивен",
            "Ford",
            CarsStatus.VIP,
            CarsCategory.PASSENGERCAR,
            Cities.BATKEN,
            "Красный",
            "Нормальный",
            "Да",
            "7/14/2023",
            "Машина на ходу",
            "Передний",
            "5.5",
            "Нет",
            2L,
            "https://cartechnic.ru/800/ford/mustang/ford_mustang_2014_2.jpg",
            "20000",
            "Mustang",
            1500000.0,
            "Баткен",
            "Левый",
            "Автомат",
            2023
        ),
        CarResponse(
            "Есть",
            "Доступен",
            "Минивен",
            "BMW",
            CarsStatus.VIP,
            CarsCategory.PASSENGERCAR,
            Cities.BATKEN,
            "Белый",
            "Нормальный",
            "Да",
            "7/14/2023",
            "Машина на ходу",
            "Передний",
            "5.5",
            "Нет",
            1L,
            "https://1gai.ru/uploads/posts/2018-06/1528215882_1-2.jpg",
            "20000",
            "X5",
            1500000.0,
            "Баткен",
            "Левый",
            "Автомат",
            2023
        ),
        CarResponse(
            "Есть",
            "Доступен",
            "Минивен",
            "Ford",
            CarsStatus.VIP,
            CarsCategory.PASSENGERCAR,
            Cities.BATKEN,
            "Красный",
            "Нормальный",
            "Да",
            "7/14/2023",
            "Машина на ходу",
            "Передний",
            "5.5",
            "Нет",
            2L,
            "https://cartechnic.ru/800/ford/mustang/ford_mustang_2014_2.jpg",
            "20000",
            "Mustang",
            1500000.0,
            "Баткен",
            "Левый",
            "Автомат",
            2023
        ),
        CarResponse(
            "Есть",
            "Доступен",
            "Минивен",
            "BMW",
            CarsStatus.VIP,
            CarsCategory.PASSENGERCAR,
            Cities.BATKEN,
            "Белый",
            "Нормальный",
            "Да",
            "7/14/2023",
            "Машина на ходу",
            "Передний",
            "5.5",
            "Нет",
            1L,
            "https://1gai.ru/uploads/posts/2018-06/1528215882_1-2.jpg",
            "20000",
            "X5",
            1500000.0,
            "Баткен",
            "Левый",
            "Автомат",
            2023
        ),
        CarResponse(
            "Есть",
            "Доступен",
            "Минивен",
            "Ford",
            CarsStatus.VIP,
            CarsCategory.PASSENGERCAR,
            Cities.BATKEN,
            "Красный",
            "Нормальный",
            "Да",
            "7/14/2023",
            "Машина на ходу",
            "Передний",
            "5.5",
            "Нет",
            2L,
            "https://cartechnic.ru/800/ford/mustang/ford_mustang_2014_2.jpg",
            "20000",
            "Mustang",
            1500000.0,
            "Баткен",
            "Левый",
            "Автомат",
            2023
        ),
        CarResponse(
            "Есть",
            "Доступен",
            "Минивен",
            "BMW",
            CarsStatus.VIP,
            CarsCategory.PASSENGERCAR,
            Cities.BATKEN,
            "Белый",
            "Нормальный",
            "Да",
            "7/14/2023",
            "Машина на ходу",
            "Передний",
            "5.5",
            "Нет",
            1L,
            "https://1gai.ru/uploads/posts/2018-06/1528215882_1-2.jpg",
            "20000",
            "X5",
            1500000.0,
            "Баткен",
            "Левый",
            "Автомат",
            2023
        ),
        CarResponse(
            "Есть",
            "Доступен",
            "Минивен",
            "Ford",
            CarsStatus.VIP,
            CarsCategory.PASSENGERCAR,
            Cities.BATKEN,
            "Красный",
            "Нормальный",
            "Да",
            "7/14/2023",
            "Машина на ходу",
            "Передний",
            "5.5",
            "Нет",
            2L,
            "https://cartechnic.ru/800/ford/mustang/ford_mustang_2014_2.jpg",
            "20000",
            "Mustang",
            1500000.0,
            "Баткен",
            "Левый",
            "Автомат",
            2023
        ),
        CarResponse(
            "Есть",
            "Доступен",
            "Минивен",
            "BMW",
            CarsStatus.VIP,
            CarsCategory.PASSENGERCAR,
            Cities.BATKEN,
            "Белый",
            "Нормальный",
            "Да",
            "7/14/2023",
            "Машина на ходу",
            "Передний",
            "5.5",
            "Нет",
            1L,
            "https://1gai.ru/uploads/posts/2018-06/1528215882_1-2.jpg",
            "20000",
            "X5",
            1500000.0,
            "Баткен",
            "Левый",
            "Автомат",
            2023
        ),
        CarResponse(
            "Есть",
            "Доступен",
            "Минивен",
            "Ford",
            CarsStatus.VIP,
            CarsCategory.PASSENGERCAR,
            Cities.BATKEN,
            "Красный",
            "Нормальный",
            "Да",
            "7/14/2023",
            "Машина на ходу",
            "Передний",
            "5.5",
            "Нет",
            2L,
            "https://cartechnic.ru/800/ford/mustang/ford_mustang_2014_2.jpg",
            "20000",
            "Mustang",
            1500000.0,
            "Баткен",
            "Левый",
            "Автомат",
            2023
        ),
        CarResponse(
            "Есть",
            "Доступен",
            "Минивен",
            "BMW",
            CarsStatus.VIP,
            CarsCategory.PASSENGERCAR,
            Cities.BATKEN,
            "Белый",
            "Нормальный",
            "Да",
            "7/14/2023",
            "Машина на ходу",
            "Передний",
            "5.5",
            "Нет",
            1L,
            "https://1gai.ru/uploads/posts/2018-06/1528215882_1-2.jpg",
            "20000",
            "X5",
            1500000.0,
            "Баткен",
            "Левый",
            "Автомат",
            2023
        ),
        CarResponse(
            "Есть",
            "Доступен",
            "Минивен",
            "Ford",
            CarsStatus.VIP,
            CarsCategory.PASSENGERCAR,
            Cities.BATKEN,
            "Красный",
            "Нормальный",
            "Да",
            "7/14/2023",
            "Машина на ходу",
            "Передний",
            "5.5",
            "Нет",
            2L,
            "https://cartechnic.ru/800/ford/mustang/ford_mustang_2014_2.jpg",
            "20000",
            "Mustang",
            1500000.0,
            "Баткен",
            "Левый",
            "Автомат",
            2023
        ),
        CarResponse(
            "Есть",
            "Доступен",
            "Минивен",
            "BMW",
            CarsStatus.VIP,
            CarsCategory.PASSENGERCAR,
            Cities.BATKEN,
            "Белый",
            "Нормальный",
            "Да",
            "7/14/2023",
            "Машина на ходу",
            "Передний",
            "5.5",
            "Нет",
            1L,
            "https://1gai.ru/uploads/posts/2018-06/1528215882_1-2.jpg",
            "20000",
            "X5",
            1500000.0,
            "Баткен",
            "Левый",
            "Автомат",
            2023
        ),
        CarResponse(
            "Есть",
            "Доступен",
            "Минивен",
            "Ford",
            CarsStatus.VIP,
            CarsCategory.PASSENGERCAR,
            Cities.BATKEN,
            "Красный",
            "Нормальный",
            "Да",
            "7/14/2023",
            "Машина на ходу",
            "Передний",
            "5.5",
            "Нет",
            2L,
            "https://cartechnic.ru/800/ford/mustang/ford_mustang_2014_2.jpg",
            "20000",
            "Mustang",
            1500000.0,
            "Баткен",
            "Левый",
            "Автомат",
            2023
        ),
        CarResponse(
            "Есть",
            "Доступен",
            "Минивен",
            "BMW",
            CarsStatus.VIP,
            CarsCategory.PASSENGERCAR,
            Cities.BATKEN,
            "Белый",
            "Нормальный",
            "Да",
            "7/14/2023",
            "Машина на ходу",
            "Передний",
            "5.5",
            "Нет",
            1L,
            "https://1gai.ru/uploads/posts/2018-06/1528215882_1-2.jpg",
            "20000",
            "X5",
            1500000.0,
            "Баткен",
            "Левый",
            "Автомат",
            2023
        ),
        CarResponse(
            "Есть",
            "Доступен",
            "Минивен",
            "Ford",
            CarsStatus.VIP,
            CarsCategory.PASSENGERCAR,
            Cities.BATKEN,
            "Красный",
            "Нормальный",
            "Да",
            "7/14/2023",
            "Машина на ходу",
            "Передний",
            "5.5",
            "Нет",
            2L,
            "https://cartechnic.ru/800/ford/mustang/ford_mustang_2014_2.jpg",
            "20000",
            "Mustang",
            1500000.0,
            "Баткен",
            "Левый",
            "Автомат",
            2023
        ),
        CarResponse(
            "Есть",
            "Доступен",
            "Минивен",
            "BMW",
            CarsStatus.VIP,
            CarsCategory.PASSENGERCAR,
            Cities.BATKEN,
            "Белый",
            "Нормальный",
            "Да",
            "7/14/2023",
            "Машина на ходу",
            "Передний",
            "5.5",
            "Нет",
            1L,
            "https://1gai.ru/uploads/posts/2018-06/1528215882_1-2.jpg",
            "20000",
            "X5",
            1500000.0,
            "Баткен",
            "Левый",
            "Автомат",
            2023
        ),
        CarResponse(
            "Есть",
            "Доступен",
            "Минивен",
            "Ford",
            CarsStatus.VIP,
            CarsCategory.PASSENGERCAR,
            Cities.BATKEN,
            "Красный",
            "Нормальный",
            "Да",
            "7/14/2023",
            "Машина на ходу",
            "Передний",
            "5.5",
            "Нет",
            2L,
            "https://cartechnic.ru/800/ford/mustang/ford_mustang_2014_2.jpg",
            "20000",
            "Mustang",
            1500000.0,
            "Баткен",
            "Левый",
            "Автомат",
            2023
        ),
        CarResponse(
            "Есть",
            "Доступен",
            "Минивен",
            "BMW",
            CarsStatus.VIP,
            CarsCategory.PASSENGERCAR,
            Cities.BATKEN,
            "Белый",
            "Нормальный",
            "Да",
            "7/14/2023",
            "Машина на ходу",
            "Передний",
            "5.5",
            "Нет",
            1L,
            "https://1gai.ru/uploads/posts/2018-06/1528215882_1-2.jpg",
            "20000",
            "X5",
            1500000.0,
            "Баткен",
            "Левый",
            "Автомат",
            2023
        ),
        CarResponse(
            "Есть",
            "Доступен",
            "Минивен",
            "Ford",
            CarsStatus.VIP,
            CarsCategory.PASSENGERCAR,
            Cities.BATKEN,
            "Красный",
            "Нормальный",
            "Да",
            "7/14/2023",
            "Машина на ходу",
            "Передний",
            "5.5",
            "Нет",
            2L,
            "https://cartechnic.ru/800/ford/mustang/ford_mustang_2014_2.jpg",
            "20000",
            "Mustang",
            1500000.0,
            "Баткен",
            "Левый",
            "Автомат",
            2023
        ),
        CarResponse(
            "Есть",
            "Доступен",
            "Минивен",
            "BMW",
            CarsStatus.VIP,
            CarsCategory.PASSENGERCAR,
            Cities.BATKEN,
            "Белый",
            "Нормальный",
            "Да",
            "7/14/2023",
            "Машина на ходу",
            "Передний",
            "5.5",
            "Нет",
            1L,
            "https://1gai.ru/uploads/posts/2018-06/1528215882_1-2.jpg",
            "20000",
            "X5",
            1500000.0,
            "Баткен",
            "Левый",
            "Автомат",
            2023
        ),
        CarResponse(
            "Есть",
            "Доступен",
            "Минивен",
            "Ford",
            CarsStatus.VIP,
            CarsCategory.PASSENGERCAR,
            Cities.BATKEN,
            "Красный",
            "Нормальный",
            "Да",
            "7/14/2023",
            "Машина на ходу",
            "Передний",
            "5.5",
            "Нет",
            2L,
            "https://cartechnic.ru/800/ford/mustang/ford_mustang_2014_2.jpg",
            "20000",
            "Mustang",
            1500000.0,
            "Баткен",
            "Левый",
            "Автомат",
            2023
        ),
        CarResponse(
            "Есть",
            "Доступен",
            "Минивен",
            "BMW",
            CarsStatus.VIP,
            CarsCategory.PASSENGERCAR,
            Cities.BATKEN,
            "Белый",
            "Нормальный",
            "Да",
            "7/14/2023",
            "Машина на ходу",
            "Передний",
            "5.5",
            "Нет",
            1L,
            "https://1gai.ru/uploads/posts/2018-06/1528215882_1-2.jpg",
            "20000",
            "X5",
            1500000.0,
            "Баткен",
            "Левый",
            "Автомат",
            2023
        ),
        CarResponse(
            "Есть",
            "Доступен",
            "Минивен",
            "Ford",
            CarsStatus.VIP,
            CarsCategory.PASSENGERCAR,
            Cities.BATKEN,
            "Красный",
            "Нормальный",
            "Да",
            "7/14/2023",
            "Машина на ходу",
            "Передний",
            "5.5",
            "Нет",
            2L,
            "https://cartechnic.ru/800/ford/mustang/ford_mustang_2014_2.jpg",
            "20000",
            "Mustang",
            1500000.0,
            "Баткен",
            "Левый",
            "Автомат",
            2023
        ),
        CarResponse(
            "Есть",
            "Доступен",
            "Минивен",
            "BMW",
            CarsStatus.VIP,
            CarsCategory.PASSENGERCAR,
            Cities.BATKEN,
            "Белый",
            "Нормальный",
            "Да",
            "7/14/2023",
            "Машина на ходу",
            "Передний",
            "5.5",
            "Нет",
            1L,
            "https://1gai.ru/uploads/posts/2018-06/1528215882_1-2.jpg",
            "20000",
            "X5",
            1500000.0,
            "Баткен",
            "Левый",
            "Автомат",
            2023
        ),
        CarResponse(
            "Есть",
            "Доступен",
            "Минивен",
            "Ford",
            CarsStatus.VIP,
            CarsCategory.PASSENGERCAR,
            Cities.BATKEN,
            "Красный",
            "Нормальный",
            "Да",
            "7/14/2023",
            "Машина на ходу",
            "Передний",
            "5.5",
            "Нет",
            2L,
            "https://cartechnic.ru/800/ford/mustang/ford_mustang_2014_2.jpg",
            "20000",
            "Mustang",
            1500000.0,
            "Баткен",
            "Левый",
            "Автомат",
            2023
        ),
        CarResponse(
            "Есть",
            "Доступен",
            "Минивен",
            "Ford",
            CarsStatus.VIP,
            CarsCategory.PASSENGERCAR,
            Cities.BATKEN,
            "Красный",
            "Нормальный",
            "Да",
            "7/14/2023",
            "Машина на ходу",
            "Передний",
            "5.5",
            "Нет",
            2L,
            "https://cartechnic.ru/800/ford/mustang/ford_mustang_2014_2.jpg",
            "20000",
            "Mustang",
            1500000.0,
            "Баткен",
            "Левый",
            "Автомат",
            2023
        ),
        CarResponse(
            "Есть",
            "Доступен",
            "Минивен",
            "Ford",
            CarsStatus.VIP,
            CarsCategory.PASSENGERCAR,
            Cities.BATKEN,
            "Красный",
            "Нормальный",
            "Да",
            "7/14/2023",
            "Машина на ходу",
            "Передний",
            "5.5",
            "Нет",
            2L,
            "https://cartechnic.ru/800/ford/mustang/ford_mustang_2014_2.jpg",
            "20000",
            "Mustang",
            1500000.0,
            "Баткен",
            "Левый",
            "Автомат",
            2023
        ),
        CarResponse(
            "Есть",
            "Доступен",
            "Минивен",
            "Ford",
            CarsStatus.VIP,
            CarsCategory.PASSENGERCAR,
            Cities.BATKEN,
            "Красный",
            "Нормальный",
            "Да",
            "7/14/2023",
            "Машина на ходу",
            "Передний",
            "5.5",
            "Нет",
            2L,
            "https://cartechnic.ru/800/ford/mustang/ford_mustang_2014_2.jpg",
            "20000",
            "Mustang",
            1500000.0,
            "Баткен",
            "Левый",
            "Автомат",
            2023
        ),
        CarResponse(
            "Есть",
            "Доступен",
            "Минивен",
            "Ford",
            CarsStatus.VIP,
            CarsCategory.PASSENGERCAR,
            Cities.BATKEN,
            "Красный",
            "Нормальный",
            "Да",
            "7/14/2023",
            "Машина на ходу",
            "Передний",
            "5.5",
            "Нет",
            2L,
            "https://cartechnic.ru/800/ford/mustang/ford_mustang_2014_2.jpg",
            "20000",
            "Mustang",
            1500000.0,
            "Баткен",
            "Левый",
            "Автомат",
            2023
        ),
        CarResponse(
            "Есть",
            "Доступен",
            "Минивен",
            "Ford",
            CarsStatus.VIP,
            CarsCategory.PASSENGERCAR,
            Cities.BATKEN,
            "Красный",
            "Нормальный",
            "Да",
            "7/14/2023",
            "Машина на ходу",
            "Передний",
            "5.5",
            "Нет",
            2L,
            "https://cartechnic.ru/800/ford/mustang/ford_mustang_2014_2.jpg",
            "20000",
            "Mustang",
            1500000.0,
            "Баткен",
            "Левый",
            "Автомат",
            2023
        ),
        CarResponse(
            "Есть",
            "Доступен",
            "Минивен",
            "Ford",
            CarsStatus.VIP,
            CarsCategory.PASSENGERCAR,
            Cities.BATKEN,
            "Красный",
            "Нормальный",
            "Да",
            "7/14/2023",
            "Машина на ходу",
            "Передний",
            "5.5",
            "Нет",
            2L,
            "https://cartechnic.ru/800/ford/mustang/ford_mustang_2014_2.jpg",
            "20000",
            "Mustang",
            1500000.0,
            "Баткен",
            "Левый",
            "Автомат",
            2023
        ),

        CarResponse(
            "Есть",
            "Доступен",
            "Минивен",
            "Ford",
            CarsStatus.VIP,
            CarsCategory.PASSENGERCAR,
            Cities.BATKEN,
            "Красный",
            "Нормальный",
            "Да",
            "7/14/2023",
            "Машина на ходу",
            "Передний",
            "5.5",
            "Нет",
            2L,
            "https://cartechnic.ru/800/ford/mustang/ford_mustang_2014_2.jpg",
            "20000",
            "Mustang",
            1500000.0,
            "Баткен",
            "Левый",
            "Автомат",
            2023
        ),
    )
    val filtered = if (filter.isNullOrBlank()) cars else cars.filter { it.brand == filter }
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.TopCenter) {
        LazyVerticalGrid(contentPadding = PaddingValues(bottom = CustomConstants.BOTTOM_APP_BAR_HEIGHT.dp), columns = GridCells.Fixed(2), content = {
            items(filtered.size) { i ->
                Card(
                    onClick = { /*TODO*/ },
                    modifier = Modifier.padding(8.dp),
                    colors = CardDefaults.cardColors(containerColor = Color.Transparent),
                    shape = RoundedCornerShape(5),
                    elevation = CardDefaults.cardElevation(),
                ) {
                    Column(Modifier.padding(3.dp)) {
                        Image(
                            painter = rememberAsyncImagePainter(model = filtered[i].image),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clip(RoundedCornerShape(5))
                                .height(120.dp)
                                .fillMaxWidth()
                        )
                        Text(text = "${filtered[i].brand} ${filtered[i].model}, ${filtered[i].yearOfIssue}")
                        Text(text = "${filtered[i].price.toInt()} $", fontWeight = FontWeight.Bold)
                        Text(text = filtered[i].regionCityOfSale, fontSize = 10.sp)
                    }
                }
            }
        })
    }
}