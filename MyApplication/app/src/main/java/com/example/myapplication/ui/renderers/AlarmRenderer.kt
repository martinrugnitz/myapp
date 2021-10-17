package com.example.myapplication.ui.renderers

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.myapplication.databinding.ItemAlarmBinding
import com.thinkup.easycore.ViewRenderer

class AlarmRenderer():ViewRenderer<AlarmRenderer.Item,ItemAlarmBinding>(Item::class) {




    override val create: (layoutIflater: LayoutInflater, parent: ViewGroup, attachToParent: Boolean) -> ItemAlarmBinding
        get() = ItemAlarmBinding::inflate

    override fun bind(binding: ItemAlarmBinding, model: Item, position: Int) {
        binding.name.text = model.name
    }



    class Item(
        val name:String,

    )
}