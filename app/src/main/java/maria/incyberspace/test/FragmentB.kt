package maria.incyberspace.test

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import maria.incyberspace.test.databinding.FragmentABinding
import maria.incyberspace.test.databinding.FragmentBBinding

class FragmentB : Fragment() {
    private val binding get() = _binding!!
    private var _binding: FragmentBBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentBBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}