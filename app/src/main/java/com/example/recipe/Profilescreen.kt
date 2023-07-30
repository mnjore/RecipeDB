package com.example.recipe

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun ProfileScreen(recipe: Recipe) {
    val scrollState = rememberScrollState()

    Column(modifier = Modifier.fillMaxSize()) {
        BoxWithConstraints {
            Surface {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .verticalScroll(scrollState),
                ) {
                    ProfileHeader(
                        recipe,
                        this@BoxWithConstraints.maxHeight
                    )
                    ProfileContent(recipe, this@BoxWithConstraints.maxHeight)
                }
            }
        }
    }
}

@Composable
private fun ProfileHeader(
    recipe: Recipe,
    containerHeight: Dp
) {
    Image(
        modifier = Modifier
            .heightIn(max = containerHeight / 2)
            .fillMaxWidth(),
        painter = painterResource(id = recipe.ImageId),
        contentScale = ContentScale.Crop,
        contentDescription = null
    )
}

@Composable
private fun ProfileContent(recipe: Recipe, containerHeight: Dp) {
    Column {
        Spacer(modifier = Modifier.height(8.dp))

        Title(recipe)

        ProfileProperty(stringResource(R.string.type), recipe.Type)
        ProfileProperty(stringResource(R.string.servings), recipe.Servings.toString())
        ProfileProperty(stringResource(R.string.difficulty), recipe.Difficulty)
        ProfileProperty(stringResource(R.string.ingredients), recipe.Ingredients)
        IngredientProperty(stringResource(R.string.steps), recipe.Steps)

        // Add a spacer that always shows part (320.dp) of the fields list regardless of the device,
        // in order to always leave some content at the top.
        Spacer(Modifier.height((containerHeight - 320.dp).coerceAtLeast(0.dp)))
    }
}

@Composable
private fun Title(recipe: Recipe) {
    Column(modifier = Modifier.padding(start = 16.dp, end = 16.dp, bottom = 16.dp, top = 16.dp)) {
        Text(
            text = recipe.Name,
            style = MaterialTheme.typography.headlineSmall,
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
fun ProfileProperty(label: String, value: String) {
    Column(modifier = Modifier.padding(start = 16.dp, end = 16.dp, bottom = 16.dp).height(IntrinsicSize.Min)) {
        Divider(modifier = Modifier.padding(bottom = 4.dp))
        Text(
            text = label,
            modifier = Modifier.height(24.dp),
            style = MaterialTheme.typography.bodySmall,
        )
        Text(
            text = value,
            modifier = Modifier.height(IntrinsicSize.Min),
            style = MaterialTheme.typography.bodyLarge,
            overflow = TextOverflow.Visible
        )
    }
}

@Composable
fun IngredientProperty(label: String, value: String) {
    Card(
        modifier = Modifier
            .padding(12.dp)
            .fillMaxWidth(),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.background,
        )

    ) {
        val expandedState = remember { mutableStateOf(false) }

        Column(modifier = Modifier.padding(start = 16.dp, end = 16.dp, bottom = 16.dp)) {
            Divider(modifier = Modifier.padding(bottom = 4.dp))
            Text(
                text = label,
                modifier = Modifier.height(24.dp),
                style = MaterialTheme.typography.bodySmall,
            )
            if (expandedState.value) {
                Text(
                    text = value,
                    modifier = Modifier.height(IntrinsicSize.Min),
                    style = MaterialTheme.typography.bodyLarge,
                    overflow = TextOverflow.Visible
                )
            } else {
                // Show only the first few lines of the content when collapsed
                Text(
                    text = value,
                    modifier = Modifier.height(56.dp),
                    style = MaterialTheme.typography.bodyLarge,
                    maxLines = 3, // You can adjust the number of lines to show when collapsed
                    overflow = TextOverflow.Ellipsis
                )
            }

            // Add a clickable area to toggle the expanded state
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .clickable {
                        expandedState.value = !expandedState.value
                    }
            ) {
                if (expandedState.value) {
                    Text("Show less", modifier = Modifier.align(Alignment.CenterEnd))
                } else {
                    Text("Show more", modifier = Modifier.align(Alignment.CenterEnd))
                }
            }
        }
    }
}