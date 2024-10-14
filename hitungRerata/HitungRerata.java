package hitungRerata;


/**
*
*	@author Zoe Satrian / 2311103141
*	S1SI 07 C
*/
public class HitungRerata {


/**
*	@param args the command line arguments
*/
public static void main(String[] args) {
    Siswa siswa = new Siswa("Zoe");
    HasilHitung rerata = new HasilHitung(95, 89, 92, siswa);
    rerata.tampilkanTotal();
}


}
 
