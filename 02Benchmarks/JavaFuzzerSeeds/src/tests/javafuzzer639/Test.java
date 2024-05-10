package tests.javafuzzer639;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 07:14:21 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-1361891079L;
    public static volatile short sFld=20599;

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1() {

        int i6=-10, i8=105, i9=-9, i10=206, i11=-48108, i12=-41183, iArr1[]=new int[N];
        byte by=-18;
        boolean bArr[]=new boolean[N];

        FuzzerUtils.init(iArr1, -42302);
        FuzzerUtils.init(bArr, false);

        i6 *= 13;
        for (int i7 : iArr1) {
            i7 <<= (int)Test.instanceCount;
            Test.instanceCount = i6;
            i8 = 1;
            while (++i8 < 4) {
                i6 = i7;
            }
            for (i9 = 1; 4 > i9; ++i9) {
                if (true) continue;
                i11 = 2;
                while ((i11 -= 3) > 0) {
                    boolean b=true;
                    Test.instanceCount -= i10;
                    bArr[i9 + 1] = b;
                    i6 += (i11 * i11);
                    by = (byte)i12;
                    i6 += (int)Test.instanceCount;
                    iArr1[i9] = -73;
                }
            }
        }
        vMeth1_check_sum += i6 + i8 + i9 + i10 + i11 + by + i12 + FuzzerUtils.checkSum(iArr1) +
            FuzzerUtils.checkSum(bArr);
    }

    public static int iMeth(long l, int i3) {

        int i4=79, i5=8, i13=-56150, i14=-3;
        float f=-1.908F;

        for (i4 = 6; i4 < 302; i4++) {
            boolean b1=false;
            vMeth1();
            i5 -= (int)1.61977;
            l += i5;
            if (b1) continue;
            f = 1;
            do {
                if (b1) {
                    i3 *= i4;
                } else if (b1) {
                    i3 >>= (int)Test.instanceCount;
                    for (i13 = 1; i13 < 1; i13++) {
                        i5 -= i5;
                        i3 = -31895;
                        if (true) break;
                        i14 += Test.sFld;
                    }
                    i3 *= Test.sFld;
                }
            } while (++f < 6);
        }
        long meth_res = l + i3 + i4 + i5 + Float.floatToIntBits(f) + i13 + i14;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(int i) {

        int i1=168, i2=12, i15=252, i16=-17359, iArr[]=new int[N];
        float f1=-2.192F;
        boolean b2=false;
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr, -38913);
        FuzzerUtils.init(lArr, 12L);

        i |= (--Test.sFld);
        for (i1 = 6; i1 < 312; i1++) {
            i2 -= iArr[i1];
            Test.instanceCount = (((Test.instanceCount + i2) << (Test.instanceCount * -13908)) - lArr[i1]);
            i2 += (~iMeth(Test.instanceCount, -5));
            if (b2) {
                for (i15 = 1; i15 < 5; i15++) {
                    i2 += i15;
                    f1 = i16;
                    i += i15;
                    try {
                        iArr[i1 + 1] = (i2 / -118);
                        i2 = (186 % i16);
                        i16 = (iArr[i1] % 59406);
                    } catch (ArithmeticException a_e) {}
                    i16 = i15;
                    if (i16 != 0) {
                        vMeth_check_sum += i + i1 + i2 + i15 + i16 + Float.floatToIntBits(f1) + (b2 ? 1 : 0) +
                            FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr);
                        return;
                    }
                }
                Test.instanceCount >>= -39491;
                i2 = 0;
                vMeth_check_sum += i + i1 + i2 + i15 + i16 + Float.floatToIntBits(f1) + (b2 ? 1 : 0) +
                    FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr);
                return;
            } else {
                if (b2) break;
            }
        }
        vMeth_check_sum += i + i1 + i2 + i15 + i16 + Float.floatToIntBits(f1) + (b2 ? 1 : 0) +
            FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr);
    }

    public void mainTest(String[] strArr1) {

        int i17=-7;
        byte by1=79;
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, 90.59960);

        vMeth(i17);
        Test.instanceCount = i17;
        by1 &= (byte)i17;
        dArr = dArr;


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
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}