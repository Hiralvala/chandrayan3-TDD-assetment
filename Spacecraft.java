public class Spacecraft {
    int x,y,z;
    char direction;

    Spacecraft(int initialX,int initialY,int initialZ,char initialdirection){
        x=initialX;
        y=initialY;
        z=initialZ;
        direction=initialdirection;
    }
    public static void main(String[] args) {
        int initialX=0,initialY=0,initialZ=0;
        char initialdirection='N';
        char[]commands={'f','r','u','b','l'};

        Spacecraft chandrayan3=new Spacecraft(initialX,initialY,initialZ,initialdirection);

    }
    
}