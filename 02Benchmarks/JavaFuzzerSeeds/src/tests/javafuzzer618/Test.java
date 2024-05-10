package tests.javafuzzer618;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 06:40:59 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=63865L;
    public static int iFld=3;
    public static double dFld=67.80272;

    public static long dMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i2, int i3) {

        int i4=-11, i5=17224, i6=145, iArr[]=new int[N];
        short s=13786;
        boolean b=false;
        byte by=-64;
        double d=77.86124;
        long lArr[][]=new long[N][N];
        float fArr[]=new float[N];

        FuzzerUtils.init(lArr, -198L);
        FuzzerUtils.init(iArr, -63);
        FuzzerUtils.init(fArr, 0.904F);

        lArr[(104 >>> 1) % N][(i2 >>> 1) % N] = i3;
        for (i4 = 11; i4 < 185; i4++) {
            i6 = 1;
            while (++i6 < 9) {
                i3 += i6;
                s -= (short)i2;
                Test.instanceCount = Test.instanceCount;
                i5 += i5;
                if (b) continue;
                i5 += (((i6 * by) + i4) - i3);
                i5 += (i6 - by);
                iArr[i6] += i4;
                i5 += (((i6 * i4) + i6) - i5);
                fArr[i6 + 1] = 30845;
            }
            i2 %= (int)((long)(d) | 1);
        }
        i3 += i3;
        vMeth1_check_sum += i2 + i3 + i4 + i5 + i6 + s + (b ? 1 : 0) + by + Double.doubleToLongBits(d) +
            FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static void vMeth() {

        float f1=0.315F;
        int i7=-6, i8=-11, i9=-9, i10=13, iArr1[][]=new int[N][N];
        long l=56183893L, lArr1[]=new long[N];
        boolean b1=false;

        FuzzerUtils.init(iArr1, -53585);
        FuzzerUtils.init(lArr1, 3730646329L);

        vMeth1(Test.iFld, Test.iFld);
        if (b1) {
            if (b1) {
                f1 -= (float)Test.dFld;
                i7 = 1;
                while (++i7 < 233) {
                    iArr1[i7 + 1] = iArr1[i7];
                    f1 += (-27 + (i7 * i7));
                    for (i8 = 1; i8 < 7; ++i8) {
                        i10 = 1;
                        do {
                            Test.instanceCount ^= Test.instanceCount;
                            Test.instanceCount += (i10 | Test.instanceCount);
                            iArr1[i7 + 1][i7 + 1] >>>= Test.iFld;
                            Test.iFld = (int)Test.instanceCount;
                            Test.iFld += i10;
                            l -= i8;
                        } while (++i10 < 2);
                    }
                }
            }
        } else if (b1) {
            Test.iFld = (int)l;
        } else {
            lArr1[(i7 >>> 1) % N] = Test.iFld;
        }
        vMeth_check_sum += Float.floatToIntBits(f1) + i7 + i8 + i9 + i10 + l + (b1 ? 1 : 0) +
            FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(lArr1);
    }

    public static double dMeth(int i1, float f) {

        int i11=-46281, i12=11, i13=-3169, i14=-63657, i15=12, i16=42190;
        long l1=195L, lArr2[][]=new long[N][N];
        short s1=9424;

        FuzzerUtils.init(lArr2, 3071141563L);

        vMeth();
        for (i11 = 15; i11 < 277; ++i11) {
            i12 += i11;
            i1 -= i12;
            for (l1 = 1; l1 < 6; l1++) {
                Test.instanceCount = Test.iFld;
                Test.instanceCount *= Test.instanceCount;
                lArr2[(i11 >>> 1) % N][(int)(l1)] = -8802;
            }
            Test.instanceCount >>>= 117;
            i14 = 1;
            while (++i14 < 6) {
                for (i15 = 1; i15 < 1; i15++) {
                    i13 = (int)f;
                    i1 += i15;
                    s1 += (short)i15;
                    i13 = (int)Test.instanceCount;
                }
            }
        }
        long meth_res = i1 + Float.floatToIntBits(f) + i11 + i12 + l1 + i13 + i14 + i15 + i16 + s1 +
            FuzzerUtils.checkSum(lArr2);
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-59547;
        float f2=108.960F;

        i += (int)dMeth(-55928, f2);


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
//DEBUG  dMeth ->  dMeth mainTest
//DEBUG  vMeth ->  vMeth dMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth dMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}