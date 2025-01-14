package tests.javafuzzer3235;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 04:23:26 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=14L;
    public static byte byFld=-110;

    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public static long lMeth(int i10, int i11, long l1) {

        int i12=-187, i13=-3082;
        boolean b=false;
        double d1=0.74625;

        for (i12 = 9; i12 < 268; ++i12) {
            switch ((i12 % 2) + 51) {
            case 51:
                i11 = i12;
                i13 -= i13;
                if (b) continue;
            case 52:
                l1 = i11;
                d1 *= 6;
                i10 -= (int)d1;
                break;
            }
            i10 = (int)Test.instanceCount;
            i11 -= (int)d1;
            if (b) break;
            l1 = i13;
        }
        l1 += i13;
        i11 = i10;
        d1 = i12;
        long meth_res = i10 + i11 + l1 + i12 + i13 + (b ? 1 : 0) + Double.doubleToLongBits(d1);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static int iMeth1(int i7, int i8) {

        int i9=0, i14=-165, iArr1[]=new int[N];
        float f1=0.901F;

        FuzzerUtils.init(iArr1, 41);

        i9 = 1;
        do {
            short s=7833;
            s = (short)lMeth(i7, 7, Test.instanceCount);
            try {
                i8 = (i8 / 48227);
                i7 = (i8 % iArr1[i9]);
                iArr1[i9 - 1] = (i7 % 143);
            } catch (ArithmeticException a_e) {}
            s = (short)f1;
            i7 += i14;
        } while (++i9 < 133);
        f1 += Test.instanceCount;
        long meth_res = i7 + i8 + i9 + Float.floatToIntBits(f1) + i14 + FuzzerUtils.checkSum(iArr1);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(long l, int i1, double d) {

        int i2=-152, i3=-10, i4=9020, i5=4, i6=12, i16=37962, iArr[]=new int[N];
        float f=2.557F, fArr[]=new float[N];

        FuzzerUtils.init(iArr, -58786);
        FuzzerUtils.init(fArr, 1.809F);

        l *= iArr[(i1 >>> 1) % N];
        i2 = 1;
        while (++i2 < 228) {
            for (i3 = 1; 7 > i3; i3++) {
                short s1=-27123;
                for (i5 = 1; 2 > i5; i5++) {
                    int i15=3;
                    f = (i4 = (int)(i3 - 2.1015F));
                    Test.instanceCount %= (((--l) - i6) | 1);
                    f -= i4;
                    i6 = i5;
                    d *= i2;
                    i4 += (iMeth1(i15, i15) + 14);
                    i4 %= (int)-3178514126633754285L;
                    i16 = (int)l;
                }
                s1 = (short)i1;
                fArr[i2 - 1] = Test.instanceCount;
                i4 += (int)d;
            }
        }
        long meth_res = l + i1 + Double.doubleToLongBits(d) + i2 + i3 + i4 + i5 + i6 + Float.floatToIntBits(f) + i16 +
            FuzzerUtils.checkSum(iArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=6, i17=-1, i18=-26677, i19=-186, i20=-1, i21=-219, i22=84, i23=646, i24=34286, iArr2[]=new int[N];
        double d2=0.127052;
        boolean b1=false;
        float f2=0.703F;

        FuzzerUtils.init(iArr2, -11);

        i <<= iMeth(Test.instanceCount, -20670, 97.65735);
        d2 -= i;
        b1 = b1;
        for (i17 = 4; i17 < 374; ++i17) {
            if (false) continue;
            for (i19 = 2; 68 > i19; i19++) {
                for (i21 = 2; i21 > 1; i21 -= 3) {
                    i20 -= i22;
                }
                for (i23 = 1; i23 < 2; ++i23) {
                    iArr2[i17 - 1] = i17;
                    Test.instanceCount = i24;
                    if (b1) {
                        iArr2[i17] -= (int)206L;
                        Test.instanceCount *= 195L;
                        i18 = 0;
                        b1 = b1;
                    } else if (b1) {
                        i24 = i24;
                        i20 = (int)-2.43889;
                        i20 -= i20;
                        d2 -= Test.instanceCount;
                    } else {
                        i24 = (int)f2;
                        Test.byFld = (byte)i;
                    }
                    iArr2[i23 + 1] += i;
                    i = (int)f2;
                    iArr2[i17 + 1] -= i24;
                    i22 *= i22;
                    f2 += (((i23 * i18) + i18) - i20);
                    Test.instanceCount = Test.instanceCount;
                }
                i20 *= (int)d2;
                i20 += (163 + (i19 * i19));
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
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 iMeth mainTest
//DEBUG  lMeth ->  lMeth iMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
