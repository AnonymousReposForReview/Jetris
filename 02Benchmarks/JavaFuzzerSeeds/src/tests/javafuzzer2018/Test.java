package tests.javafuzzer2018;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 07:27:11 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-3L;
    public static float fFld=74.43F;
    public static int iFld=0;

    public static long iMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth(int i7, int i8) {

        int i9=-2, i10=-167, i11=7, i12=58089, iArr1[]=new int[N];
        double d=-92.57493;
        short s=-27074;
        float f=2.824F;

        FuzzerUtils.init(iArr1, -1901);

        if (true) {
            for (i9 = 11; 219 > i9; ++i9) {
                Test.instanceCount += i9;
                for (i11 = 1; 8 > i11; i11 += 3) {
                    i8 -= i11;
                    d -= Test.instanceCount;
                    iArr1[i9 - 1] = i8;
                    i7 <<= i10;
                    i7 += i7;
                    i12 >>= (int)-2L;
                    i12 = i10;
                    i8 -= i8;
                }
                i8 += i9;
                i7 += (((i9 * i10) + Test.instanceCount) - i10);
                s += (short)(i9 | (long)f);
            }
        } else {
            f = i11;
        }
        vMeth_check_sum += i7 + i8 + i9 + i10 + i11 + i12 + Double.doubleToLongBits(d) + s + Float.floatToIntBits(f) +
            FuzzerUtils.checkSum(iArr1);
    }

    public static float fMeth() {

        int i6=245, i13=6, i14=-20, i15=22597, i16=11, iArr2[]=new int[N];
        byte by=-44;
        float f1=58.920F, fArr[][]=new float[N][N];
        short s1=-10306;
        long lArr[][]=new long[N][N];

        FuzzerUtils.init(lArr, 4L);
        FuzzerUtils.init(fArr, 2.846F);
        FuzzerUtils.init(iArr2, 4);

        i6 = (i6++);
        by -= (byte)lArr[(i6 >>> 1) % N][(i6 >>> 1) % N];
        vMeth(i6, i6);
        fArr[(146 >>> 1) % N][(i6 >>> 1) % N] = Test.instanceCount;
        for (i13 = 366; i13 > 1; --i13) {
            i6 |= (int)-566557407L;
            for (f1 = 1; f1 < 5; ++f1) {
                i16 = 1;
                while (++i16 < 2) {
                    i15 *= (int)Test.instanceCount;
                    iArr2[i16] = s1;
                    i15 += (i16 * by);
                    i14 <<= (int)Test.instanceCount;
                    Test.fFld += f1;
                    i6 *= (int)33425L;
                    i15 = Test.iFld;
                }
            }
        }
        long meth_res = i6 + by + i13 + i14 + Float.floatToIntBits(f1) + i15 + i16 + s1 + FuzzerUtils.checkSum(lArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(iArr2);
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public static int iMeth() {

        int i=11, i1=-11, i2=-11, i3=32063, i4=7187, i5=-187, i17=-57127, i18=-87, i19=30062, iArr[]=new int[N];
        double d1=34.3803;
        boolean b=false;
        long lArr1[]=new long[N];

        FuzzerUtils.init(iArr, -39);
        FuzzerUtils.init(lArr1, -5244L);

        for (i = 18; i < 360; i++) {
            Test.instanceCount = (long)((-i1) - Float.intBitsToFloat((int)(-(i1 + Test.instanceCount))));
            for (i2 = 1; 5 > i2; i2++) {
                iArr[i2] = (int)(-4090686118L + ((-(i * i1)) / ((i1++) | 1)));
                for (i4 = 1; i4 < 2; i4++) {
                    Test.instanceCount = (long)(i5 += (int)(fMeth() - i2));
                    d1 = i5;
                    Test.instanceCount >>= -50;
                    if (b) continue;
                }
                i5 += i5;
                for (i17 = 1; i17 < 2; ++i17) {
                    i5 *= i1;
                }
                i19 = 1;
                do {
                    lArr1[i19 + 1] = i4;
                    i3 = (int)Test.instanceCount;
                } while (++i19 < 2);
            }
        }
        long meth_res = i + i1 + i2 + i3 + i4 + i5 + Double.doubleToLongBits(d1) + (b ? 1 : 0) + i17 + i18 + i19 +
            FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {


        Test.instanceCount = ((iMeth() + Test.instanceCount) - Test.iFld);


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
//DEBUG  fMeth ->  fMeth iMeth mainTest
//DEBUG  vMeth ->  vMeth fMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
