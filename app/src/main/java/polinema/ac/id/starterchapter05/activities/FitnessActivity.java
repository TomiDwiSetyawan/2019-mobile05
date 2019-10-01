package polinema.ac.id.starterchapter05.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import polinema.ac.id.starterchapter05.R;
import polinema.ac.id.starterchapter05.fragment.BlueFragment;
import polinema.ac.id.starterchapter05.fragment.DipsFragment;
import polinema.ac.id.starterchapter05.fragment.HandstandFragment;
import polinema.ac.id.starterchapter05.fragment.PushupsFragment;
import polinema.ac.id.starterchapter05.fragment.RedFragment;

public class FitnessActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fitness);
    }

    public void handlerClickLoadPushupFragment(View view) {
        Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.fitnes_activ);
        if(fragment == null  || fragment instanceof DipsFragment || fragment instanceof HandstandFragment){
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.setCustomAnimations(R.anim.enter_from_left,R.anim.exit_from_left,R.anim.enter_from_left,R.anim.exit_from_right);
            fragmentTransaction.replace(R.id.fitnes_activ,new PushupsFragment(),"PUSHUP_FRAGMENT");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }

    public void handlerClickLoadDipsFragment(View view) {
        Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.fitnes_activ);
        if(fragment == null  || fragment instanceof PushupsFragment || fragment instanceof HandstandFragment){
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.setCustomAnimations(R.anim.enter_from_left,R.anim.exit_from_left,R.anim.enter_from_left,R.anim.exit_from_right);
            fragmentTransaction.replace(R.id.fitnes_activ,new DipsFragment(),"DIPS_FRAGMENT");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }

    public void handlerClickLoadHandstandFragment(View view) {
        Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.fitnes_activ);
        if(fragment == null  || fragment instanceof PushupsFragment || fragment instanceof DipsFragment){
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.setCustomAnimations(R.anim.enter_from_left,R.anim.exit_from_left,R.anim.enter_from_left,R.anim.exit_from_right);
            fragmentTransaction.replace(R.id.fitnes_activ,new HandstandFragment(),"HANDSTAND_FRAGMENT");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }
}
