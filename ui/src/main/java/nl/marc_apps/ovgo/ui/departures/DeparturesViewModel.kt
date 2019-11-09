package nl.marc_apps.ovgo.ui.departures

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DeparturesViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is departures Fragment"
    }
    val text: LiveData<String> = _text
}