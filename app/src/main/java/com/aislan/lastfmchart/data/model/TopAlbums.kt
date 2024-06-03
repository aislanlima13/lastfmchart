package com.aislan.lastfmchart.data.model


import com.google.gson.annotations.SerializedName

data class TopAlbums(
    @SerializedName("topalbums")
    val topalbums: TopalbumsX
)

data class TopalbumsX(
    @SerializedName("album")
    val album: List<Album>,
    @SerializedName("@attr")
    val attr: AttrX
)

data class Album(
    @SerializedName("artist")
    val artist: Artist,
    @SerializedName("@attr")
    val attr: Attr,
    @SerializedName("image")
    val image: List<Image>,
    @SerializedName("mbid")
    val mbid: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("playcount")
    val playcount: String,
    @SerializedName("url")
    val url: String
)

data class Artist(
    @SerializedName("mbid")
    val mbid: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("url")
    val url: String
)

data class Attr(
    @SerializedName("rank")
    val rank: String
)

data class Image(
    @SerializedName("size")
    val size: String,
    @SerializedName("#text")
    val text: String
)

data class AttrX(
    @SerializedName("page")
    val page: String,
    @SerializedName("perPage")
    val perPage: String,
    @SerializedName("total")
    val total: String,
    @SerializedName("totalPages")
    val totalPages: String,
    @SerializedName("user")
    val user: String
)
