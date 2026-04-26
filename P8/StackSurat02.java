package P8;

public class StackSurat02 {
    Surat02[] stack;
    int top;
    int size;

    StackSurat02(int size) {
        this.size = size;
        stack = new Surat02[size];
        top = -1;
    }

    boolean isFull() {
        return top == size - 1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    void push(Surat02 s) {
        if (!isFull()) {
            top++;
            stack[top] = s;
            System.out.println("Surat berhasil ditambahkan!");
        } else {
            System.out.println("Stack penuh!");
        }
    }

    Surat02 pop() {
        if (!isEmpty()) {
            Surat02 s = stack[top];
            top--;
            return s;
        } else {
            System.out.println("Tidak ada surat!");
            return null;
        }
    }

    Surat02 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    boolean cari(String nama) {
        for (int i = 0; i <= top; i++) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                return true;
            }
        }
        return false;
    }
}
