package com.example.androidkotlinproject.presentation.views

import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.androidkotlinproject.R
import com.example.androidkotlinproject.domain.EmailUtils
import com.example.androidkotlinproject.presentation.MainActivity
import com.example.androidkotlinproject.presentation.viewmodel.TodoViewModel
import kotlinx.android.synthetic.main.fragment_login.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [LoginFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class LoginFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private lateinit var viewModel: TodoViewModel
    private lateinit var SP: SharedPreferences
    private var connected: Boolean = false

    //https://bf1c2958-117f-4bbb-9b96-b77ded2ea179.mock.pstmn.io/login

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        context?.let {
            viewModel = TodoViewModel()
        }

        if(!connected) {
            login()
        }

        log_signup_button.setOnClickListener {
            (activity as MainActivity).navigateToSignUp()
        }
    }

    private fun login() {
        log_login_button.setOnClickListener {
            if (EmailUtils.isEmailValid(log_text_email.text) && log_text_password.text.isNotEmpty()) {
                Toast.makeText(activity, "non connecté: email: ${log_text_email.text} & mot de passe: ${log_text_password.text}", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(activity, "non connecté: email: ${log_text_email.text} & mot de passe: ${log_text_password.text}", Toast.LENGTH_SHORT).show()
            }
        }
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment LoginFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            LoginFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}