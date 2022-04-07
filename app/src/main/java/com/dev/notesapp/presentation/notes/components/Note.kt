package com.dev.notesapp.presentation.notes.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun NoteItem(){

    Card(modifier = Modifier
        .fillMaxWidth()
        .wrapContentHeight()) {

        Column(modifier = Modifier.padding(16.dp)) {

            Text(
                text = "A quick brown fox jumps over the lazy dog...",
                maxLines = 6,
                overflow = TextOverflow.Ellipsis
            )
            
            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "Feb 20, 2022",
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )


        }
        

    }
}

@Preview
@Composable
private fun NoteItemPreview()
{
     NoteItem()
}