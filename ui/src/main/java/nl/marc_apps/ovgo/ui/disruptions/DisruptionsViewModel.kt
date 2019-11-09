package nl.marc_apps.ovgo.ui.disruptions

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DisruptionsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is disruptions Fragment"
    }
    val text: LiveData<String> = _text
}