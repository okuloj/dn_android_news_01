package com.edu.news.screen.follows

import android.view.View
import com.edu.news.utils.base.BaseFragment
import com.sun.news.R

class FollowsFragment : BaseFragment() {

    override fun getLayoutResourceId() = R.layout.fragment_follows

    override fun initView(view: View) {
    }

    override fun initData() {
    }

    companion object {
        fun newInstance() = FollowsFragment()
    }
}
