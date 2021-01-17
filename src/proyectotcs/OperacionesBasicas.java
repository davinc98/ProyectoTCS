/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectotcs;

/**
 *
 * @author J.PEREZ
 */
public class OperacionesBasicas {

    public void Sumar(String XN, String HN, int indiceX, int indiceH) {        
        String [] Xn = XN.split(",");        
        String [] Hn = HN.split(",");
        
        System.out.print("Xn: ");
        for(String e: Xn)
            System.out.print(""+e+",");
        System.out.println(" ");
        System.out.print("Hn: ");
        for(String e: Hn)
            System.out.print(""+e+",");
        System.out.println(" ");
              
        
        int posX = Xn.length - indiceX;
        int negX = Xn.length - posX;        
        int posH = Hn.length - indiceH;
        int negH = Hn.length - posH;        
        
        int posT = 0;int negT = 0;        
        if(negX>=negH)
            negT=negX;
        else
            negT=negH;        
        
        if(posX>=posH)
            posT = posX;
        else
            posT = posH;
        
        System.out.println("Elem Neg: "+negT);
        System.out.println("Elem Pos: "+posT);
        
        Double [] Gn = new Double[posT+negT];
        for(int i=0; i<posT+negT; i++){Gn[i]=0.0;}
        
        System.out.print("Gn: ");
        for(Double e: Gn)
            System.out.print(""+e+",");
        System.out.println(" ");
        
        //Sumar Negativos
        for(int i=negT; i>=0; i--){
            Double xn, hn;
            
            if(indiceX-i>=0)
                xn= Double.parseDouble(Xn[indiceX-i]);
            else
                xn=0.0;              
            if(indiceH-i>=0)                
                hn = Double.parseDouble(Hn[indiceH-i]);
            else
                hn=0.0;       
            Gn[negT-i]= xn+hn;
        }
        
        //Sumar positivos desde cero
        for(int i=0; i<posT; i++){
            Double xn, hn;
            
            if(indiceX+i<Xn.length)
                xn= Double.parseDouble(Xn[indiceX+i]);
            else
                xn=0.0;             
            if(indiceH+i<Hn.length)                
                hn = Double.parseDouble(Hn[indiceH+i]);
            else
                hn=0.0;         
            Gn[negT+i]= xn+hn;
        }    
        
        System.out.print("Suma: ");
        for(Double e: Gn)
            System.out.print(""+e+",");
        System.out.println(" ");
        
    }
    
    public void Restar(String XN, String HN, int indiceX, int indiceH){
        String [] Xn = XN.split(",");        
        String [] Hn = HN.split(",");
        
        System.out.print("Xn: ");
        for(String e: Xn)
            System.out.print(""+e+",");
        System.out.println(" ");
        System.out.print("Hn: ");
        for(String e: Hn)
            System.out.print(""+e+",");
        System.out.println(" ");
        
        int posX = Xn.length - indiceX;
        int negX = Xn.length - posX;        
        int posH = Hn.length - indiceH;
        int negH = Hn.length - posH;        
        
        int posT = 0;int negT = 0;        
        if(negX>=negH)
            negT=negX;
        else
            negT=negH;        
        
        if(posX>=posH)
            posT = posX;
        else
            posT = posH;
        
        System.out.println("Elem Neg: "+negT);
        System.out.println("Elem Pos: "+posT);
        
        Double [] Gn = new Double[posT+negT];
        for(int i=0; i<posT+negT; i++){Gn[i]=0.0;}
        
        System.out.print("Gn: ");
        for(Double e: Gn)
            System.out.print(""+e+",");
        System.out.println(" ");
        
        //Sumar Negativos
        for(int i=negT; i>=0; i--){
            Double xn, hn;
            
            if(indiceX-i>=0)
                xn= Double.parseDouble(Xn[indiceX-i]);
            else
                xn=0.0;              
            if(indiceH-i>=0)                
                hn = Double.parseDouble(Hn[indiceH-i]);
            else
                hn=0.0;       
            Gn[negT-i]= xn-hn;
        }
        
        //Sumar positivos desde cero
        for(int i=0; i<posT; i++){
            Double xn, hn;
            
            if(indiceX+i<Xn.length)
                xn= Double.parseDouble(Xn[indiceX+i]);
            else
                xn=0.0;             
            if(indiceH+i<Hn.length)                
                hn = Double.parseDouble(Hn[indiceH+i]);
            else
                hn=0.0;         
            Gn[negT+i]= xn-hn;
        }    
        
        System.out.print("Resta: ");
        for(Double e: Gn)
            System.out.print(""+e+",");
        System.out.println(" ");
    }
    
}
