package br.com.liveo.mvp.screen.home

import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.support.v7.widget.RecyclerView
import android.view.View
import br.com.liveo.mvp.databinding.ActivityHomeItemBinding

/**
 * Created by rudsonlima on 8/29/17.
 */

class HomeViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private val mBinding: ActivityHomeItemBinding

    init {

        this.mBinding = DataBindingUtil.bind<ActivityHomeItemBinding>(view)
    }

    val binding: ViewDataBinding
        get() = mBinding
}
