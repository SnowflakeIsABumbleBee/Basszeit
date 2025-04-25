
import java.util.ArrayList;

import com.HTW_Berlin.Basszeit.Music;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//@Entity
public class Votes {

    int countsPerMusic;
    Music music;
    int rang;
    ArrayList[] musicList;
}
