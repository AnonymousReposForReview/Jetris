package tests.javafuzzer2938;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 23:25:32 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=0L;
    public static volatile float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.fArrFld, -11.237F);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long byMeth_check_sum = 0;

    public static byte byMeth(int i4, int i5) {

        long l=9181340688969903083L;
        int i6=9, i7=7, i8=28470, i9=78, i10=-39268, i11=4, i12=28916, iArr2[]=new int[N];
        float f=-89.656F, f1=-2.338F;
        double d=-124.48267;

        FuzzerUtils.init(iArr2, 16);

        for (l = 9; l < 388; ++l) {
            Test.instanceCount += i5;
            i5 += i4;
        }
        for (i7 = 4; i7 < 195; i7++) {
            f = 1;
            do {
                boolean b=true;
                if (b) break;
                for (i9 = 1; i9 < 1; i9++) {
                    f1 -= f;
                    Test.instanceCount = i5;
                    iArr2[(int)(f - 1)] -= i4;
                    i8 >>= i4;
                    f1 += i5;
                }
                for (i11 = 1; i11 > 1; i11--) {
                    Test.fArrFld[(int)(f)] = -117;
                    d += i5;
                }
            } while (++f < 8);
        }
        long meth_res = i4 + i5 + l + i6 + i7 + i8 + Float.floatToIntBits(f) + i9 + i10 + Float.floatToIntBits(f1) +
            i11 + i12 + Double.doubleToLongBits(d) + FuzzerUtils.checkSum(iArr2);
        byMeth_check_sum += meth_res;
        return (byte)meth_res;
    }

    public static void vMeth1() {

        int i3=185, i13=4, i14=-252, i15=9, i16=-37366, i17=10, i18=-43358, i19=-240, iArr1[]=new int[N];
        double d1=-126.65668;
        float f2=-56.574F;
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr1, -56263);
        FuzzerUtils.init(lArr, 2L);

        i3 -= i3;
        i3 -= ((iArr1[(7524 >>> 1) % N]--) - iArr1[(i3 >>> 1) % N]);
        iArr1[(i3 >>> 1) % N] = (int)(Math.min(Long.reverseBytes(Test.instanceCount), -(i3 + i3)) * lArr[(-7 >>> 1) %
            N]);
        iArr1[(i3 >>> 1) % N] -= (int)Math.min(--Test.instanceCount, lArr[(i3 >>> 1) % N] >>>= byMeth(i3, 167));
        for (i13 = 3; 180 > i13; i13 += 3) {
            i14 -= (int)d1;
            for (i15 = 1; i15 < 26; i15++) {
                f2 -= i13;
                iArr1 = iArr1;
                i14 %= (int)(Test.instanceCount | 1);
            }
            i3 |= i3;
            i17 = 1;
            while (++i17 < 26) {
                for (i18 = i17; i18 < 1; ++i18) {
                    f2 += (((i18 * i16) + i16) - i18);
                    Test.instanceCount = i3;
                }
            }
        }
        vMeth1_check_sum += i3 + i13 + i14 + Double.doubleToLongBits(d1) + i15 + i16 + Float.floatToIntBits(f2) + i17 +
            i18 + i19 + FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth() {

        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, -16.182F);

        fArr = (fArr = (fArr = FuzzerUtils.float1array(N, (float)-22.302F)));
        vMeth1();
        Test.instanceCount = 3;
        vMeth_check_sum += Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public void mainTest(String[] strArr1) {

        int i=141, i1=-140, i2=152, iArr[]=new int[N];

        FuzzerUtils.init(iArr, 5);

        for (i = 1; i < 159; i++) {
            try {
                iArr[i - 1] = (163 / i);
                i1 = (-1721090924 % i);
                i2 = (i1 / i);
            } catch (ArithmeticException a_e) {}
            vMeth();
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
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  byMeth ->  byMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
