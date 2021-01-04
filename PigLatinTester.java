public class PigLatinTester {
    public static void main(String[] args) {
        System.out.println(PigLatin.pigLatinSimple("mock"));
        System.out.println(PigLatin.pigLatinSimple("pie"));
        System.out.println(PigLatin.pigLatinSimple("david"));
        System.out.println(PigLatin.pigLatinSimple("aaron"));
        System.out.println(PigLatin.pigLatin("the"));
        System.out.println(PigLatin.pigLatin("check"));
        System.out.println(PigLatin.pigLatin("skee"));
        System.out.println(PigLatin.pigLatin("emu"));
        System.out.println(PigLatin.pigLatin("grade"));
        System.out.println(PigLatin.pigLatinBest("*emu"));
        System.out.println(PigLatin.pigLatinBest("4chan")); 
        System.out.println(PigLatin.pigLatinBest("fish!"));
        System.out.println(PigLatin.pigLatinBest("fish"));
        System.out.println(PigLatin.pigLatinBest("the."));
        System.out.println(PigLatin.pigLatinBest("cat!"));
        System.out.println(PigLatin.pigLatinBest("amazing?"));
        System.out.println(PigLatin.pigLatinBest("apple%"));
    }
}