package com.company;

public class Cube {
    int[][] colors = new int[6][4];
    public Cube(int[][] colors){
        this.colors=colors;
    }

    public void clkTurn(int side){
        int tmp=this.colors[side-1][3];
        int tmp1=0;
        int tmp2=0;
        for (int i = 2; i >=0 ; i--) {
            this.colors[side-1][i+1]=this.colors[side-1][i];
            this.colors[side-1][i]=tmp;
        }
        if (side == 1){
            tmp1=this.colors[1][0];
            tmp2=this.colors[1][1];
            this.colors[1][0]=this.colors[2][0];
            this.colors[1][1]=this.colors[2][1];
            this.colors[2][0]=tmp1;
            this.colors[2][1]=tmp2;

            this.colors[2][0]=this.colors[3][0];
            this.colors[2][1]=this.colors[3][1];
            this.colors[3][0]=tmp1;
            this.colors[3][1]=tmp2;

            this.colors[3][0]=this.colors[5][3];
            this.colors[3][1]=this.colors[5][2];
            this.colors[5][3]=tmp1;
            this.colors[2][2]=tmp2;
        }
        if (side == 2){
            tmp1=this.colors[5][0];
            tmp2=this.colors[5][2];
            this.colors[5][0]=this.colors[4][0];
            this.colors[5][2]=this.colors[4][2];
            this.colors[4][0]=tmp1;
            this.colors[4][2]=tmp2;

            this.colors[4][0]=this.colors[3][0];
            this.colors[4][2]=this.colors[3][2];
            this.colors[3][0]=tmp1;
            this.colors[3][2]=tmp2;

            this.colors[3][0]=this.colors[0][0];
            this.colors[3][2]=this.colors[0][2];
            this.colors[0][0]=tmp1;
            this.colors[0][2]=tmp2;
        }
        if (side == 3){
            tmp1=this.colors[4][0];
            tmp2=this.colors[4][1];
            this.colors[4][0]=this.colors[3][2];
            this.colors[4][1]=this.colors[3][0];
            this.colors[3][2]=tmp1;
            this.colors[3][0]=tmp2;

            this.colors[3][2]=this.colors[0][3];
            this.colors[3][0]=this.colors[0][2];
            this.colors[0][3]=tmp1;
            this.colors[0][2]=tmp2;

            this.colors[0][3]=this.colors[1][1];
            this.colors[0][2]=this.colors[1][3];
            this.colors[1][1]=tmp1;
            this.colors[1][3]=tmp2;
        }
        if (side == 4){
            tmp1=this.colors[0][1];
            tmp2=this.colors[0][3];
            this.colors[0][1]=this.colors[2][1];
            this.colors[0][3]=this.colors[2][3];
            this.colors[2][1]=tmp1;
            this.colors[2][3]=tmp2;

            this.colors[2][1]=this.colors[4][1];
            this.colors[2][3]=this.colors[4][3];
            this.colors[4][1]=tmp1;
            this.colors[4][3]=tmp2;

            this.colors[4][1]=this.colors[5][1];
            this.colors[4][3]=this.colors[5][3];
            this.colors[5][1]=tmp1;
            this.colors[2][3]=tmp2;
        }
        if (side == 5){
            tmp1=this.colors[5][0];
            tmp2=this.colors[5][1];
            this.colors[5][0]=this.colors[3][3];
            this.colors[5][1]=this.colors[3][2];
            this.colors[3][3]=tmp1;
            this.colors[3][2]=tmp2;

            this.colors[3][3]=this.colors[2][3];
            this.colors[3][2]=this.colors[2][2];
            this.colors[2][3]=tmp1;
            this.colors[2][2]=tmp2;

            this.colors[2][3]=this.colors[1][3];
            this.colors[2][2]=this.colors[1][2];
            this.colors[1][3]=tmp1;
            this.colors[1][2]=tmp2;
        }
        if (side == 6){
            tmp1=this.colors[4][2];
            tmp2=this.colors[4][3];
            this.colors[4][2]=this.colors[1][0];
            this.colors[4][3]=this.colors[1][2];
            this.colors[1][0]=tmp1;
            this.colors[1][2]=tmp2;

            this.colors[1][0]=this.colors[0][1];
            this.colors[1][2]=this.colors[0][0];
            this.colors[0][1]=tmp1;
            this.colors[0][0]=tmp2;

            this.colors[0][1]=this.colors[3][3];
            this.colors[0][0]=this.colors[3][1];
            this.colors[3][3]=tmp1;
            this.colors[3][1]=tmp2;
        }
    }


}
