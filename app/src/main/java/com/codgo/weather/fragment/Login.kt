package com.codgo.weather.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.codgo.weather.R
import com.codgo.weather.databinding.FragmentLoginBinding


class Login : Fragment(), View.OnClickListener {

    val binding by lazy {
        FragmentLoginBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.login.setOnClickListener(this)
        binding.register.setOnClickListener(this)
    }

    override fun onClick(v: View?) {

        when(v!!.id){

            R.id.register ->findNavController().navigate(R.id.action_login_to_register)

            R.id.login-> checkLogin()

        }

    }

    private fun checkLogin() {
        TODO("Not yet implemented")
    }


}