public class boiteNoir {
    public static void main(String[] args) {

        //variables
       float mVolSphere = 3517,poidsSphere, rayonSphere= (float) 2.15, volumeSphere,
                mVolSubstanceIsolation = (float)13545.88, poidsSubstanceIsolation,
                volumeSubstanceIsolation,quantiteSubstanceIsolation, poidsBoite= 375, poidsTotal, volumeBoite = 125 ;

       //calculs
        volumeSphere = (float) (4*Math.PI*(Math.pow(rayonSphere,3))/3);
        poidsSphere = (float) mVolSphere*volumeSphere;
        volumeSubstanceIsolation = (float) volumeBoite-volumeSphere;
        quantiteSubstanceIsolation = volumeSubstanceIsolation*1000;
        poidsSubstanceIsolation = mVolSubstanceIsolation*volumeSubstanceIsolation;
        poidsTotal= poidsBoite+poidsSphere+poidsSubstanceIsolation;

    // Affichage du rapport d'informations
        System.out.println("-------------------------------------------");System.out.println("-RAPPORT D'INFORMATIONS");
        System.out.println("  Sphere");
        System.out.println("   * Masse volumique : " + mVolSphere + " kg/m3");
        System.out.println("   * Poids : " + poidsSphere + " kg");
        System.out.println("   * Rayon : " + rayonSphere + " m");
        System.out.println("   * Volume : " + volumeSphere + " m3");
        System.out.println("  Substance isolante");
        System.out.println("   * Masse volumique : " + mVolSubstanceIsolation + " kg/m3");
        System.out.println("   * Poids : " + poidsSubstanceIsolation + " kg");
        System.out.println("   * Volume : " + volumeSubstanceIsolation + " m3");
         System.out.println("   * Quantite: " + quantiteSubstanceIsolation+ " l");
        System.out.println("  Boite noire");System.out.println("   * Poids : " + poidsBoite+ " kg");
        System.out.println("   * Volume : " + volumeBoite + " m3");
        System.out.println("   * Poids total : " + poidsTotal + " kg");
        System.out.println("-------------------------------------------");

        }


}

