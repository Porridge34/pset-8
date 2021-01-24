public class ProblemSet8 {
    public static void main(String args[]) {
        ProblemSet8 test = new ProblemSet8();
        int[] arr1 = {1, 2};
        int[] arr2 = {1};
        int[] result = test.sequential(arr1, arr2);
        for (int i : result) {
            System.out.println(i);
        }

    }
    public boolean common(int[] a, int[] b) {
        if (a != null && b != null && a.length != 0 && b.length != 0) {
            if (a[a.length - 1] == b[b.length - 1]) {
                return true;
            }
        }
        return false;
    }

    public int[] middleman(int[] a, int[] b) {
        if (a != null && b != null && a.length % 2 == 1 && b.length % 2 == 1) {
            int[] middle = {a[a.length / 2], b[b.length / 2]};
            return middle;
        }
        return null;
    }

    public int[] bigger(int[] a, int[] b) {
        if (a != null && b != null) {
            int suma = 0;
            for (int i : a) {
                suma += i;
            }
            int sumb = 0;
            for (int i : b) {
                sumb += i;
            }
            if (suma > sumb) {
                return a;
            }
            else if (sumb > suma) {
                return b;
            }
            else {
                return a;
            }
        }
        return null;
    }

    public int[] doubleMiddle(int[] a, int[] b) {
        if (a != null && b != null && a.length % 2 == 0 && b.length % 2 == 0
        && a.length != 0 && b.length != 0) {
            int[] middle = {a[a.length / 2 - 1], a[a.length / 2], b[b.length / 2 - 1], b[b.length / 2]};
            return middle;
        }
        return null;
    }

    public int[] swapMe(int[] a) {
        if (a != null) {
            if (a.length == 0) {
                return a;
            }
            int [] swapped = new int[a.length];
            for (int i = 0; i < a.length; i++){
                swapped[i] = a[i];
            }
            swapped[0] = a[a.length-1];
            swapped[a.length-1] = a[0];
            return swapped;
        }
        return null;
    }

    public int[] threePoint(int[] a) {
        if (a != null && a.length % 2 == 1 && a.length != 0) {
            if (a.length == 1) {
                int [] threes = {a[0], a[0], a[0]};
                return threes;
            }
            int[] threes = {a[0], a[a.length / 2], a[a.length - 1]};
            return threes;
        }
        return null;
    }

    public int headHoncho(int[] a) {
        if (a != null && a.length != 0) {
            int largest = a[0];
            for (int i : a) {
                if (i < 0) {
                    return -1;
                }
                if (largest < i){
                    largest = i;
                }
            }
            return largest;
        }
        return -1;
    }

    public boolean tippingPoint(int[] a, int threshold) {
        if (a != null) {
            int sum = 0;
            for (int i : a) {
                sum += i;
            }
            if (sum > threshold) {
                return true;
            }
        }
        return false;
    }

    public String halfway(int[] a) {
        if (a != null && a.length % 2 == 0 && a.length != 0){
            int leftsum = 0;
            for (int i = 0; i < a.length / 2; i++) {
                leftsum += a[i];
            }
            int rightsum = 0;
            for (int i = a.length / 2; i < a.length; i++) {
                rightsum += a[i];
            }
            if (leftsum > rightsum){
                return "LEFT";
            }
            else {
                return "RIGHT";
            }
        }
        return null;
    }

    public int[] sequential(int[] a, int[] b) {
        if (a != null && b != null && a.length + b.length >= 3){
            int[] sequence = new int[3];
            for (int i = 0; i < 3; i ++){
                if (a.length > i) {
                    sequence[i] = a[i];
                }
                else {
                    sequence[i] = b[i - a.length];
                }
            }
            return sequence;
        }
        return null;
    }
}
