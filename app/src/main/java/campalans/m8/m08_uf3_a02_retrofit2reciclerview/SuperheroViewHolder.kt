package campalans.m8.m08_uf3_a02_retrofit2reciclerview

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import campalans.m8.m08_uf3_a02_retrofit2reciclerview.databinding.ItemSuperheroBinding
import com.squareup.picasso.Picasso

class SuperheroViewHolder(view:View): RecyclerView.ViewHolder(view) {

    private val binding = ItemSuperheroBinding.bind(view)

    fun bind(superheroItemResponse: SuperheroItemResponse, onItemSelected:(String) -> Unit){
        binding.tvSuperheroName.text = superheroItemResponse.name
        Picasso.get().load(superheroItemResponse.superheroImage.url).into(binding.ivSuperHero)
        binding.root.setOnClickListener{onItemSelected(superheroItemResponse.superheroId)}
    }
}