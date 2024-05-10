package tests.javafuzzer1285;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 17:40:35 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=55L;
    public static int iFld=-4;
    public static boolean bFld=false;
    public static short sFld=26614;

    public static long lMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(byte by1) {

        int i3=11, i4=-201, i5=-2, i6=-235, iArr1[][]=new int[N][N];
        float f1=0.127F;
        short s=29776;
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr1, 37);
        FuzzerUtils.init(lArr, 4120645215L);

        for (i3 = 153; i3 > 3; i3 -= 2) {
            iArr1[i3 - 1][i3 - 1] += (int)Test.instanceCount;
            switch (((i3 % 10) * 5) + 95) {
            case 97:
                lArr[i3] = Test.instanceCount;
                break;
            case 143:
                f1 += Test.iFld;
                i5 = 1;
                do {
                    iArr1[i3][i5] = -16141;
                    i6 = 1;
                    while ((i6 += 2) < 1) {
                        Test.instanceCount = Test.iFld;
                        s += (short)Test.instanceCount;
                    }
                } while (++i5 < 21);
                break;
            case 101:
            case 130:
                i4 <<= 54364;
                f1 = 234L;
                i4 >>>= i6;
                lArr[i3 - 1] = i3;
                break;
            case 140:
                Test.iFld <<= i3;
                break;
            case 120:
                i4 = i6;
                break;
            case 121:
                lArr[i3] += i6;
                break;
            case 132:
                Test.iFld -= i3;
                break;
            case 133:
                Test.iFld = Test.iFld;
                break;
            case 98:
                lArr[i3] += i4;
            default:
                iArr1[i3] = FuzzerUtils.int1array(N, (int)-11);
            }
        }
        vMeth1_check_sum += by1 + i3 + i4 + Float.floatToIntBits(f1) + i5 + i6 + s + FuzzerUtils.checkSum(iArr1) +
            FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth() {

        int i1=6, i2=1, i7=-49720, i8=-9, iArr[]=new int[N];
        byte by=-110;
        double d=5.21610;
        float f=-1.441F;
        short sArr[]=new short[N];

        FuzzerUtils.init(iArr, 5);
        FuzzerUtils.init(sArr, (short)-18434);

        iArr[(i1 >>> 1) % N] <<= by;
        for (d = 13; d < 299; ++d) {
            f *= (Test.instanceCount++);
            i1 = by;
            vMeth1(by);
            for (i7 = 1; i7 < 6; ++i7) {
                f += i1;
                sArr[(Test.iFld >>> 1) % N] = (short)i7;
                if (Test.bFld) continue;
                f += i8;
                i2 = 42088;
                Test.sFld = (short)i2;
            }
            f -= -117;
            i1 *= i1;
            i2 -= 20875;
        }
        vMeth_check_sum += i1 + by + Double.doubleToLongBits(d) + i2 + Float.floatToIntBits(f) + i7 + i8 +
            FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(sArr);
    }

    public static long lMeth(long l1) {

        int iArr2[]=new int[N];

        FuzzerUtils.init(iArr2, -60);

        vMeth();
        iArr2[(Test.iFld >>> 1) % N] = Test.iFld;
        Test.iFld += Test.iFld;
        long meth_res = l1 + FuzzerUtils.checkSum(iArr2);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        long l=4270274830L;
        int i=13983, i9=-6, i10=17993, i12=-17447, i13=19364, i14=11101, iArr3[]=new int[N];
        float f2=-82.111F, f3=33.523F, f4=68.896F;
        double d1=67.50892;
        short sArr1[]=new short[N];

        FuzzerUtils.init(sArr1, (short)4274);
        FuzzerUtils.init(iArr3, 213);

        for (l = 7; l < 186; l++) {
            if (true) break;
            Test.instanceCount -= (Integer.reverseBytes(i + i) - lMeth(Test.instanceCount));
            Test.iFld += (int)(((l * l) + Test.instanceCount) - Test.sFld);
            Test.iFld = (int)f2;
            i9 = 1;
            while (++i9 < 140) {
                Test.iFld = (int)Test.instanceCount;
                sArr1[(int)(l)] *= (short)Test.iFld;
                try {
                    i = (i % i9);
                    Test.iFld = (Test.iFld / i9);
                    i = (i % 1010470062);
                } catch (ArithmeticException a_e) {}
                Test.instanceCount = i;
                i10 = 1;
                while (++i10 < 1) {
                    i = (int)f2;
                    f2 = 4;
                    d1 = d1;
                    f3 = i;
                    i = (int)Test.instanceCount;
                    i >>>= (int)l;
                    i &= 11;
                    i = 106;
                }
                Test.iFld += (i9 - i9);
            }
            f3 += l;
            i >>= i;
            for (i12 = 7; i12 < 140; ++i12) {
                int i15=-52502;
                for (f4 = 1; f4 < 2; f4++) {
                    i14 -= Test.iFld;
                    i >>= (int)l;
                    Test.iFld *= (int)l;
                    Test.instanceCount += i12;
                }
                i15 += (((i12 * i) + Test.sFld) - f4);
                i15 += i12;
            }
        }



    }
    public static void main(String[] strArr) {

        try {
            Test _instance = new Test();
            for (int i = 0; i < 10; i++ ) {
                _instance.mainTest(strArr);
            }
         } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
         }
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  lMeth ->  lMeth mainTest
//DEBUG  vMeth ->  vMeth lMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
