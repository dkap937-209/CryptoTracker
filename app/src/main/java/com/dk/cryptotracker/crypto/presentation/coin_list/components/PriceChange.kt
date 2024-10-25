package com.dk.cryptotracker.crypto.presentation.coin_list.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dk.cryptotracker.crypto.presentation.models.DisplayableNumber
import com.dk.cryptotracker.ui.theme.greenBackground

@Composable
fun PriceChange(
    modifier: Modifier = Modifier,
    change: DisplayableNumber
) {
    val contentColour = if(change.value < 0){
        MaterialTheme.colorScheme.onErrorContainer
    } else Color.Green

    val backgroundColour = if(change.value < 0){
        MaterialTheme.colorScheme.errorContainer
    } else greenBackground

    Row(
        modifier = modifier
            .clip(RoundedCornerShape(100f))
            .background(backgroundColour)
            .padding(horizontal = 4.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = if(change.value < 0.0) {
                Icons.Default.KeyboardArrowDown
            } else {
                Icons.Default.KeyboardArrowUp
            },
            contentDescription = null,
            modifier = Modifier.size(20.dp),
            tint = contentColour
        )

        Text(
            text = "${change.value} %",
            color = contentColour,
            fontSize = 14.sp,
            fontWeight = FontWeight.Medium
        )
    }
}

@PreviewLightDark
@Composable
private fun PriceChangePreview() {
    PriceChange(
        change = DisplayableNumber(
            value = 2.43,
            formatted = "2.43"
        )
    )
}