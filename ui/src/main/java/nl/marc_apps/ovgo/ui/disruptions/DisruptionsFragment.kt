package nl.marc_apps.ovgo.ui.disruptions

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import nl.marc_apps.ovgo.ui.R

class DisruptionsFragment : Fragment() {

    private lateinit var disruptionsViewModel: DisruptionsViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        disruptionsViewModel =
            ViewModelProviders.of(this).get(DisruptionsViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_disruptions, container, false)
        val textView: TextView = root.findViewById(R.id.text_notifications)
        disruptionsViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}
