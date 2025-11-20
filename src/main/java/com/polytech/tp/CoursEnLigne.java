package com.polytech.tp;

public class CoursEnLigne extends CoursDecorator {
    CoursEnLigne(ICours cours) {
        //TODO: Implémenter le reste ...
        super(cours);
        //DONE
    }

    @Override
    public String getDescription() {
        // TODO Auto-generated method stub
        
        return super.getDescription() + " (En ligne)";
        //DONE
    }

    @Override
    public double getDuree() {
        // TODO Auto-generated method stub
        
        return super.getDuree();
        //DONE
    };
}
