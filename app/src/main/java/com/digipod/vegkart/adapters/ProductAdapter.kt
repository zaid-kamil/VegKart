package com.digipod.vegkart.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.digipod.vegkart.R
import com.digipod.vegkart.models.Product

class ProductAdapter(
    val context: Context,
    val layoutRes: Int,
    val products: List<Product>,
) : RecyclerView.Adapter<ProductAdapter.Holder>() {

    class Holder(private val view: View) : RecyclerView.ViewHolder(view) {
        private val name: TextView = view.findViewById(R.id.name)
        private val price: TextView = view.findViewById(R.id.price)
        private val image: ImageView = view.findViewById(R.id.image)
        fun bind(product: Product) {
            name.text = product.name
            price.text = product.price.toString()
            image.setImageResource(product.imageRes)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(context).inflate(layoutRes, parent, false)
        return Holder(view)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bind(products[position])
    }

    override fun getItemCount() = products.size


}