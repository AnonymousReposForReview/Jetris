package tests.javafuzzer1984;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 06:59:54 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-7055127427738184053L;
    public static byte byFld=31;
    public double dFld=2.24880;
    public short sFld=6120;
    public boolean bFld=true;
    public static boolean bArrFld[]=new boolean[N];
    public long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.bArrFld, false);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public void vMeth2() {

        int i5=-177, i6=7, i7=40805, i8=-203, i9=19039, i10=13, iArr[]=new int[N];
        boolean b=false;
        byte byArr[]=new byte[N];
        float fArr[]=new float[N];

        FuzzerUtils.init(byArr, (byte)89);
        FuzzerUtils.init(fArr, 0.550F);
        FuzzerUtils.init(iArr, -56794);

        for (i5 = 10; i5 < 160; ++i5) {
            byArr[i5 + 1] = (byte)Test.instanceCount;
            if (b) {
                fArr[i5] = 80;
                for (i7 = i5; i7 < 11; ++i7) {
                    i8 += (int)Test.instanceCount;
                    for (i9 = 1; i9 > 1; i9 -= 3) {
                        Test.bArrFld[i5 + 1] = b;
                        switch ((i5 % 5) + 21) {
                        case 21:
                            dFld *= i8;
                            iArr[i9 - 1] = i6;
                            break;
                        case 22:
                            dFld = i5;
                            Test.instanceCount -= Test.instanceCount;
                            if (i10 != 0) {
                                vMeth2_check_sum += i5 + i6 + i7 + i8 + i9 + i10 + (b ? 1 : 0) +
                                    FuzzerUtils.checkSum(byArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) +
                                    FuzzerUtils.checkSum(iArr);
                                return;
                            }
                            Test.instanceCount = Test.instanceCount;
                        case 23:
                            i8 += (i9 ^ i6);
                            break;
                        case 24:
                            i8 += (i9 * i8);
                        case 25:
                            iArr = FuzzerUtils.int1array(N, (int)237);
                            break;
                        }
                    }
                }
            }
        }
        vMeth2_check_sum += i5 + i6 + i7 + i8 + i9 + i10 + (b ? 1 : 0) + FuzzerUtils.checkSum(byArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(iArr);
    }

    public void vMeth1(int i3, int i4, long l) {

        int i11=-8, i12=3, i13=11, i14=-110, i15=-195, i16=-4068;
        float f=59.912F;
        boolean b1=true;
        long l1=-1651841954L;

        vMeth2();
        i3 += (int)l;
        l += Test.instanceCount;
        i11 = 1;
        do {
            for (f = 1; f < 16; f++) {
                Test.instanceCount += Test.instanceCount;
            }
        } while ((i11 += 2) < 195);
        i3 -= (int)3L;
        for (i13 = 200; i13 > 5; i13 -= 3) {
            b1 = b1;
            for (i15 = 1; i15 < 24; i15++) {
                i12 += (i15 - l1);
                l += i15;
                i4 += (((i15 * i15) + i12) - i4);
                Test.byFld += (byte)l;
                i16 = (int)l;
            }
        }
        vMeth1_check_sum += i3 + i4 + l + i11 + Float.floatToIntBits(f) + i12 + i13 + i14 + (b1 ? 1 : 0) + i15 + i16 +
            l1;
    }

    public void vMeth(int i) {

        int i1=-45261, i2=-15254, iArr1[]=new int[N];
        boolean b2=false;
        float f1=1.481F;

        FuzzerUtils.init(iArr1, 0);

        for (i1 = 5; i1 < 337; ++i1) {
            vMeth1(i2, -6, Test.instanceCount);
            Test.instanceCount = i2;
            if (b2) {
                i = sFld;
                vMeth_check_sum += i + i1 + i2 + (b2 ? 1 : 0) + Float.floatToIntBits(f1) + FuzzerUtils.checkSum(iArr1);
                return;
            } else {
                switch (((i2 >>> 1) % 2) + 56) {
                case 56:
                case 57:
                    i2 = i2;
                    break;
                }
                i2 <<= i1;
                if (b2) {
                    i += i1;
                    Test.byFld = (byte)Test.instanceCount;
                    i <<= 55954;
                } else if (false) {
                    f1 *= -84;
                    if (i != 0) {
                        vMeth_check_sum += i + i1 + i2 + (b2 ? 1 : 0) + Float.floatToIntBits(f1) +
                            FuzzerUtils.checkSum(iArr1);
                        return;
                    }
                    iArr1[i1 + 1] &= (int)Test.instanceCount;
                } else if (b2) {
                    Test.instanceCount = i;
                }
            }
        }
        vMeth_check_sum += i + i1 + i2 + (b2 ? 1 : 0) + Float.floatToIntBits(f1) + FuzzerUtils.checkSum(iArr1);
    }

    public void mainTest(String[] strArr1) {

        int i17=167, i18=8, i19=188, i20=-54199, i21=-224, i22=-226, i23=3, i24=6, i25=-2, iArr2[]=new int[N];
        float f2=-81.886F, f3=14.400F, f4=1.690F;
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr2, 37766);
        FuzzerUtils.init(lArr, 168L);

        Test.byFld -= (byte)dFld;
        vMeth(i17);
        dFld += i17;
        i17 = (int)Test.instanceCount;
        iArr2[(i17 >>> 1) % N] = 11;
        for (i18 = 11; i18 < 215; ++i18) {
            i20 = 1;
            do {
                Test.instanceCount += (long)-2.554F;
                f2 += f2;
                i17 = (int)Test.instanceCount;
            } while (++i20 < 123);
            i19 += i18;
            for (i21 = 2; i21 < 123; i21++) {
                bFld = bFld;
                try {
                    iArr2[i18] = (i19 / i17);
                    i17 = (-1109698906 % i21);
                    i19 = (i21 / -169);
                } catch (ArithmeticException a_e) {}
                i17 += (i21 | i21);
                i19 *= i19;
            }
            bFld = bFld;
            i19 *= (int)5452L;
        }
        for (f3 = 18; 343 > f3; ++f3) {
            dFld = i18;
            Test.instanceCount *= (long)dFld;
            i17 -= 2;
            iArr2[(int)(f3 + 1)] -= (int)dFld;
            for (i24 = 77; i24 > f3; i24 -= 2) {
                i22 = i17;
                f4 = 1;
                do {
                    lArrFld = lArr;
                    Test.instanceCount = sFld;
                } while (++f4 < 1);
                i25 = i24;
                i19 = i24;
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
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}