package pertemuan10;

// Latihan 4 & Tugas
public class StakMain {
    public static void main(String[] args) {
        StruktureStack stack = new StruktureStack(3);
        System.out.println("#Sebelum push");
        stack.displayElement();

        System.out.println();

        System.out.println("#Melakukan push 3x\n" +
                "push 2, push 4, push 1");
        stack.push(2);
        stack.push(4);
        stack.push(1);
        stack.displayElement();

        stack.pop();

        System.out.println();

        System.out.println("#Melakukan Pop");
        stack.displayElement();
    }
}
