class Pupil {
    public void study() {
        System.out.println("Studying");
    }

    public void read() {
        System.out.println("Reading");
    }

    public void write() {
        System.out.println("Writing");
    }

    public void relax() {
        System.out.println("Relaxing");
    }
}

class ExcellentPupil extends Pupil {
    @Override
    public void study() {
        System.out.println("Excellent pupil wants to study his/her whole life");
    }
}

class GoodPupil extends Pupil {
    @Override
    public void read() {
        System.out.println("Good pupil wants to read books");
    }
}

class BadPupil extends Pupil {
    @Override
    public void relax() {
        System.out.println("Bad pupil only wants to relax");
    }
}

class ClassRoom {
    private Pupil[] pupils;

    public void pupilsActivity() {
        for (Pupil pupil : pupils) {
            System.out.println("Activities:");
            pupil.study();
            pupil.read();
            pupil.write();
            pupil.relax();
            System.out.println();
        }
    }

    public ClassRoom() {
        pupils = new Pupil[]{new Pupil(), new ExcellentPupil(), new GoodPupil(), new BadPupil()};
    }
}

