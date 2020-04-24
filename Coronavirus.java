public class Coronavirus{
 private float infeccio;
 private float mortaldat;
 Coronavirus(float x, float y)
 {
 infeccio=xx;
 mortaldat=yy;
 }
 Coronavirus(){

 }
 Coronavirus(Coronavirus c) {
     this.infeccio = c.infeccio;
     this.mortaldat = c.mortaldat;
 }

 @Override
 public String toString(Coronavirus c){
     String s = "";
     s+= "Infecció: " + this.infeccio + "| Mortaldat: " + this.mortaldat;
     return s;
 }

 @Override
 public boolean equals(Coronavirus c) {
     if (this.infeccio == c.infeccio && this.mortaldat == c.mortaldat) {
         return true;
     } else {
         return false;
     }
 }
}
