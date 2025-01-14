package tests.javafuzzer1209;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 16:34:59 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-4255293531L;
    public static boolean bFld=false;
    public static volatile int iFld=25;
    public static int iArrFld[]=new int[N];
    public int iArrFld1[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -13);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(int i3) {

        int i4=225, i5=-10, i6=82, i7=241, i8=-31108, i9=-2;
        float f3=2.959F;
        long l2=-107L, lArr[][]=new long[N][N];
        byte by1=0;

        FuzzerUtils.init(lArr, 14L);

        i3 &= i3;
        for (i4 = 11; i4 < 297; i4++) {
            i5 <<= (int)Test.instanceCount;
            i5 += (i4 | i3);
        }
        f3 %= ((long)(f3) | 1);
        for (i6 = 11; i6 < 368; ++i6) {
            Test.iArrFld[i6 - 1] <<= i6;
            for (i8 = 1; 5 > i8; ++i8) {
                i5 *= i7;
                l2 = 1;
                do {
                    i9 += (int)f3;
                    i5 -= (int)Test.instanceCount;
                    lArr[i6 - 1][i6] += i5;
                    by1 += (byte)(l2 - i4);
                    i3 += i6;
                } while (++l2 < 2);
            }
        }
        vMeth2_check_sum += i3 + i4 + i5 + Float.floatToIntBits(f3) + i6 + i7 + i8 + i9 + l2 + by1 +
            FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth1(long l1) {

        int i1=57481, i2=60230, i10=23405, i11=2809;
        float f2=0.98F, f4=-108.559F;
        byte by=65;

        i1 += (i1++);
        Test.iArrFld[(i1 >>> 1) % N] = Math.max(--i1, i1);
        i1 = (int)(++f2);
        by = (byte)(i1--);
        if (true) {
            i2 = 1;
            while (++i2 < 241) {
                if (i2 <= (--Test.iArrFld[i2])) continue;
                vMeth2(-254);
                f2 += i1;
                i10 = 1;
                do {
                    i1 -= i1;
                    switch (((i1 >>> 1) % 1) + 37) {
                    case 37:
                        for (f4 = 1; f4 < 1; ++f4) {
                            i1 *= (int)Test.instanceCount;
                            i11 = (int)l1;
                        }
                        break;
                    }
                } while (++i10 < 7);
            }
            vMeth1_check_sum += l1 + i1 + Float.floatToIntBits(f2) + by + i2 + i10 + Float.floatToIntBits(f4) + i11;
            return;
        } else if (true) {
            Test.instanceCount |= -14;
        } else if (Test.bFld) {
            i1 = (int)l1;
        } else {
            i11 = (int)Test.instanceCount;
        }
        vMeth1_check_sum += l1 + i1 + Float.floatToIntBits(f2) + by + i2 + i10 + Float.floatToIntBits(f4) + i11;
    }

    public static void vMeth(float f, float f1, int i) {

        long l=-3848238377L, lArr1[][]=new long[N][N];
        float f5=11.364F;
        int i12=26670, i13=0, i14=5, i15=35722, iArr[]=new int[N];
        byte by2=3;

        FuzzerUtils.init(iArr, 13);
        FuzzerUtils.init(lArr1, -1L);

        l -= iArr[(i >>> 1) % N];
        vMeth1(l);
        f += f;
        i *= (int)f1;
        for (f5 = 8; f5 < 306; ++f5) {
            switch ((((i12 >>> 1) % 1) * 5) + 14) {
            case 19:
                try {
                    i12 = (-1345392324 / i12);
                    Test.iArrFld[(int)(f5)] = (Test.iArrFld[(int)(f5)] % i12);
                    i = (-20868 % i);
                } catch (ArithmeticException a_e) {}
                break;
            }
        }
        i12 += i12;
        lArr1[(i12 >>> 1) % N][(i >>> 1) % N] = (long)1.40142;
        i = (int)l;
        i13 = 1;
        while (++i13 < 169) {
            Test.iArrFld[i13] %= (int)(i12 | 1);
            for (i14 = 1; i14 < 9; i14++) {
                Test.instanceCount = 216;
                i15 -= by2;
            }
        }
        vMeth_check_sum += Float.floatToIntBits(f) + Float.floatToIntBits(f1) + i + l + Float.floatToIntBits(f5) + i12
            + i13 + i14 + i15 + by2 + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr1);
    }

    public void mainTest(String[] strArr1) {

        float f6=-120.954F;
        double d=0.42512;
        int i16=-12, i17=54, i18=-43583, i19=235, i20=20033, i21=11, i22=3;

        vMeth(-2.321F, f6, -10);
        Test.iArrFld[(Test.iFld >>> 1) % N] += Test.iFld;
        for (d = 10; d < 210; d++) {
            for (i17 = 4; i17 < 126; i17++) {
                short s=-6976;
                f6 += (-82 + (i17 * i17));
                s += (short)(i17 | Test.iFld);
                Test.instanceCount = Test.instanceCount;
                Test.iFld += (-66 + (i17 * i17));
                Test.iFld += (i17 * i17);
                if (true) {
                    for (i19 = 1; 2 > i19; ++i19) {
                        i16 >>>= i17;
                        f6 = i18;
                        f6 *= i20;
                        f6 += i16;
                        Test.iFld += (int)f6;
                        Test.instanceCount += (i19 | i16);
                        i18 -= i17;
                        i18 = 245;
                        Test.bFld = Test.bFld;
                    }
                } else if (Test.bFld) {
                    Test.iArrFld[i17 - 1] += Test.iFld;
                    i20 *= i18;
                    iArrFld1[(int)(d)] = i17;
                    iArrFld1[i17 - 1] *= i20;
                } else {
                    for (i21 = 1; i21 < 2; i21++) {
                        Test.instanceCount *= i18;
                        i18 = (int)f6;
                        Test.instanceCount >>= Test.instanceCount;
                        Test.instanceCount += i19;
                        s = (short)i21;
                    }
                }
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
