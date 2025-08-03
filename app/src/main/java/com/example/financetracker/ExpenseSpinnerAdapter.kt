package com.example.financetracker

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.BaseAdapter
import com.example.financetracker.databinding.ExpenseSpinnerItemBinding

class ExpenseSpinnerAdapter(context: Context, items: List<SpinnerItem>) :
    ArrayAdapter<SpinnerItem>(context, 0, items) {
    val inflater: LayoutInflater = LayoutInflater.from(context)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = convertView ?: LayoutInflater.from(context)
            .inflate(R.layout.expense_spinner_item, parent, false)
        val binding = ExpenseSpinnerItemBinding.bind(view)
        val item = getItem(position)
        if (item!=null){
            binding.ivSpinnerItem.setImageResource(item.icon)
            binding.tvSpinnerItem.text=item.text
        }
        return view
    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = convertView ?: LayoutInflater.from(context)
            .inflate(R.layout.expense_spinner_item, parent, false)
        val binding = ExpenseSpinnerItemBinding.bind(view)
        val item = getItem(position)
        if (item!=null){
            binding.ivSpinnerItem.setImageResource(item.icon)
            binding.tvSpinnerItem.text=item.text
        }
        return view
    }

}