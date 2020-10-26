package edu.stanford.kadams6.mymaps.models

import java.io.Serializable

data class UserMap(val title: String, val places: List<Place>) : Serializable
// attributes: title, a list of markers to represent places
// we'll define place
