package com.example.android.navigation


import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.android.navigation.databinding.FragmentTitleBinding
import android.view.*
import androidx.navigation.ui.NavigationUI

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class TitleFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentTitleBinding>(inflater,
                R.layout.fragment_title, container, false)

//        binding.playButton.setOnClickListener { view: View ->
//            view.findNavController().navigate(R.id.action_titleFragment2_to_gameFragment)
//        }

        binding.playButton.setOnClickListener { view: View ->
            view.findNavController().navigate(TitleFragmentDirections.actionTitleFragment2ToGameFragment())
        }

//        binding.aboutButton.setOnClickListener { view: View ->
//            view.findNavController().navigate(R.id.action_titleFragment2_to_aboutFragment)
//        }

        binding.aboutButton.setOnClickListener { view: View ->
            view.findNavController().navigate(TitleFragmentDirections.actionTitleFragment2ToAboutFragment())
        }

//       binding.rulesButton.setOnClickListener { view: View ->
//           view.findNavController().navigate(R.id.action_titleFragment2_to_rulesFragment)
//       }

        binding.rulesButton.setOnClickListener { view: View->
            view.findNavController().navigate(TitleFragmentDirections.actionTitleFragment2ToRulesFragment())
        }

        setHasOptionsMenu(true)
        Log.i("TitleFragment", "onCreateView called")
        return binding.root
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i("TitleFragment", "onAttach called")
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("TitleFragment", "onCreate called")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i("TitleFragment", "onViewCreated called")
    }

    override fun onStart() {
        super.onStart()
        Log.i("TitleFragment", "onStart called")
    }
    override fun onResume() {
        super.onResume()
        Log.i("TitleFragment", "onResume called")
    }
    override fun onPause() {
        super.onPause()
        Log.i("TitleFragment", "onPause called")
    }
    override fun onStop() {
        super.onStop()
        Log.i("TitleFragment", "onStop called")
    }
    override fun onDestroyView() {
        super.onDestroyView()
        Log.i("TitleFragment", "onDestroyView called")
    }
    override fun onDetach() {
        super.onDetach()
        Log.i("TitleFragment", "onDetach called")
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.options_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(item, requireView().findNavController())
                || super.onOptionsItemSelected(item)
    }
}