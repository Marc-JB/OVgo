package nl.marc_apps.ovgo.ui.departures

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import nl.marc_apps.ovgo.ui.R

class DeparturesFragment : Fragment() {

    private lateinit var departuresViewModel: DeparturesViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        departuresViewModel =
            ViewModelProviders.of(this).get(DeparturesViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_departures, container, false)
        val textView: TextView = root.findViewById(R.id.text_dashboard)
        departuresViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}
