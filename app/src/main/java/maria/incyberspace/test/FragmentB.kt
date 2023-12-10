package maria.incyberspace.test

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import maria.incyberspace.test.databinding.FragmentBBinding

class FragmentB : Fragment() {

    private val binding get() = _binding!!
    private val viewModel: FragmentBViewModel by viewModels()
    private var _binding: FragmentBBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentBBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setText()
        viewModel.sendTextToFragmentA()
    }

    private fun getArgs() = requireArguments().getString("Text")

    private fun setText() {
        with (binding) {
            changedInFragBTextView.text = getArgs()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}