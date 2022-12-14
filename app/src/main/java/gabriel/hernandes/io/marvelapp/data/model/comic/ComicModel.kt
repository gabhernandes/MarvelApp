package gabriel.hernandes.io.marvelapp.data.model.comic

import com.google.gson.annotations.SerializedName
import gabriel.hernandes.io.marvelapp.data.model.ThumbnailModel
import java.io.Serializable

data class ComicModel(
    @SerializedName("id")
    val id: Int,
    @SerializedName("title")
    val title: String,
    @SerializedName("description")
    val description: String,
    @SerializedName("thumbnail")
    val thumbnailModel: ThumbnailModel
) : Serializable
