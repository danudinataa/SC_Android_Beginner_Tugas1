import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.sc_tugas1.AnimeList
import com.example.sc_tugas1.DataAnimeList
import com.example.sc_tugas1.MyAdapter
import com.example.sc_tugas1.R
import com.example.sc_tugas1.databinding.FragmentItemBinding

class ItemFragment : Fragment() {
    private var recyclerbinding : FragmentItemBinding? = null

    private var columnCount = 1

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_first, container, false)

        if (view is RecyclerView) {
            with(view) {
                layoutManager = GridLayoutManager(context, columnCount)

                val listAdapter = MyAdapter()
                listAdapter.setListItem(DataAnimeList.makelist())
                adapter = listAdapter
            }
        }
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()

        recyclerbinding = null
    }

}