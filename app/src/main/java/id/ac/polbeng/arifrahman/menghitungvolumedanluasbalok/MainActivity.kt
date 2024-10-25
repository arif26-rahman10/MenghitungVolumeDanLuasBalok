package id.ac.polbeng.arifrahman.menghitungvolumedanluasbalok

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import id.ac.polbeng.arifrahman.menghitungvolumedanluasbalok.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonCalculate.setOnClickListener {
            val length = binding.inputLength.text.toString().toDoubleOrNull()
            val width = binding.inputWidth.text.toString().toDoubleOrNull()
            val height = binding.inputHeight.text.toString().toDoubleOrNull()

            if (length != null && width != null && height != null) {
                val volume = length * width * height
                val surfaceArea = 2 * (length * width + width * height + length * height)

                binding.textResultVolume.text = getString(R.string.result_volume, volume.toString())
                binding.textResultSurfaceArea.text = getString(R.string.result_surface_area, surfaceArea.toString())
            } else {
                binding.textResultVolume.text = getString(R.string.invalid_input)
                binding.textResultSurfaceArea.text = ""
            }
        }
    }
}
