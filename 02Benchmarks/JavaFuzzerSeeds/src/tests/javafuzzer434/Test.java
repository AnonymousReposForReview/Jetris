package tests.javafuzzer434;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 03:51:20 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=8982966746171320119L;
    public float fFld=-79.859F;
    public static int iFld=14;
    public double dFld=8.11421;
    public short sFld=-16185;
    public boolean bFld=true;
    public byte byFld=-17;
    public static long lArrFld[]=new long[N];
    public static int iArrFld[][]=new int[N][N];
    public static float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.lArrFld, -3512920321L);
        FuzzerUtils.init(Test.iArrFld, 93);
        FuzzerUtils.init(Test.fArrFld, 96.718F);
    }

    public static long lMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long lMeth1_check_sum = 0;

    public static long lMeth1(boolean b, long l) {

        double d2=119.126609, d3=-2.95888;
        int i2=16898, i3=5679, i4=-30994;
        short s=-12109;

        for (d2 = 2; d2 < 216; ++d2) {
            if (b) continue;
            Test.iFld = Test.iFld;
            Test.instanceCount += Test.iFld;
            Test.instanceCount <<= 28367;
            i3 = 1;
            do {
                if (false) {
                    Test.instanceCount = (long)d2;
                } else {
                    Test.lArrFld[(int)(d2 + 1)] -= Test.iFld;
                    i4 = 1;
                    do {
                        Test.iFld += (int)Test.instanceCount;
                        Test.instanceCount += (((i4 * i2) + Test.instanceCount) - i4);
                        d3 = i3;
                    } while (++i4 < 1);
                }
                s = (short)d2;
                i2 <<= i4;
            } while (++i3 < 8);
        }
        long meth_res = (b ? 1 : 0) + l + Double.doubleToLongBits(d2) + i2 + i3 + i4 + Double.doubleToLongBits(d3) + s;
        lMeth1_check_sum += meth_res;
        return (long)meth_res;
    }

    public static int iMeth() {

        boolean b1=false;
        int i5=11, i6=-1, i7=7, iArr[]=new int[N];
        float f1=-1.232F, fArr[]=new float[N];
        short sArr[]=new short[N];

        FuzzerUtils.init(iArr, 0);
        FuzzerUtils.init(fArr, -38.313F);
        FuzzerUtils.init(sArr, (short)32599);

        iArr[(Test.iFld >>> 1) % N] >>= (int)lMeth1(b1, Test.instanceCount);
        for (i5 = 239; i5 > 1; i5 -= 3) {
            if (b1) continue;
            if (b1) {
                fArr = fArr;
                i7 = 1;
                while (++i7 < 19) {
                    i6 *= (int)2.580F;
                    try {
                        iArr[(i5 >>> 1) % N] = (i5 % i7);
                        i6 = (iArr[i7] / 250469120);
                        Test.iFld = (i7 / i5);
                    } catch (ArithmeticException a_e) {}
                    i6 >>>= Test.iFld;
                }
                if (true) {
                    Test.iFld += (i5 * i5);
                    f1 += (((i5 * i6) + i5) - i6);
                    Test.lArrFld[i5 + 1] = i6;
                    Test.lArrFld[i5] *= i6;
                } else {
                    if (false) break;
                }
            } else {
                Test.iArrFld = Test.iArrFld;
            }
        }
        long meth_res = (b1 ? 1 : 0) + i5 + i6 + i7 + Float.floatToIntBits(f1) + FuzzerUtils.checkSum(iArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(sArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static long lMeth(int i1, double d, double d1) {

        int i8=-142, i9=7, i10=-43775, i11=-8, i12=-30, i13=-8;
        boolean b2=true;
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, 0.44221);

        i1 += (int)(((i1 + i1) * (i1 * -13L)) - (iMeth() + Test.iFld));
        switch ((((Test.iFld >>> 1) % 2) * 5) + 14) {
        case 16:
            for (float f2 : Test.fArrFld) {
                f2 = i1;
                for (i8 = 1; i8 < 4; ++i8) {
                    i1 += (int)Test.instanceCount;
                }
                i9 -= i9;
                if (Test.iFld != 0) {
                }
                for (i10 = 1; i10 < 4; i10++) {
                    b2 = b2;
                    for (i12 = 1; i12 < 2; i12++) {
                        Test.iArrFld[i12] = Test.iArrFld[(i8 >>> 1) % N];
                        Test.instanceCount |= 2;
                        i11 ^= (int)Test.instanceCount;
                    }
                    dArr[i10] -= -136;
                }
            }
            break;
        case 24:
        }
        long meth_res = i1 + Double.doubleToLongBits(d) + Double.doubleToLongBits(d1) + i8 + i9 + i10 + i11 + (b2 ? 1 :
            0) + i12 + i13 + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        float f=2.855F;
        int i=0, i14=79, i15=173, i16=3, i17=-6, i18=-17755, i19=107, i20=18836;
        byte byArr[]=new byte[N];

        FuzzerUtils.init(byArr, (byte)35);

        for (f = 306; f > 7; --f) {
            fFld = (lMeth(i, dFld, dFld) + sFld);
            try {
                i = (-1492937439 / i);
                Test.iFld = (23622254 / Test.iFld);
                i = (-55894 % Test.iFld);
            } catch (ArithmeticException a_e) {}
            for (i14 = 2; i14 < 84; i14++) {
                try {
                    i15 = (i14 % Test.iArrFld[(int)(f)][i14 - 1]);
                    i15 = (-699819721 / i15);
                    Test.iArrFld[i14][i14] = (Test.iArrFld[(int)(f - 1)][(int)(f - 1)] % Test.iFld);
                } catch (ArithmeticException a_e) {}
                for (i16 = 2; i16 > 1; --i16) {
                    try {
                        i17 = (Test.iFld % 1757453126);
                        i17 = (-14787 % i);
                        Test.iFld = (i18 % -44429);
                    } catch (ArithmeticException a_e) {}
                    i15 = i16;
                    if (bFld) {
                        fFld += (i16 - i16);
                        i15 *= sFld;
                        if (bFld) continue;
                    }
                }
                dFld -= i16;
                if (bFld) {
                    Test.instanceCount = byFld;
                    i18 = i;
                    byArr[i14] |= (byte)i14;
                    Test.lArrFld[(int)(f + 1)] -= Test.instanceCount;
                }
                dFld += i15;
                sFld = (short)46;
                if (bFld) break;
                dFld *= Test.instanceCount;
                sFld -= (short)f;
                for (i19 = 2; 1 < i19; i19 -= 2) {
                    fFld -= i18;
                    if (true) {
                        i20 += (int)Test.instanceCount;
                        i20 += (-116 + (i19 * i19));
                    } else {
                        sFld += (short)(i19 + i20);
                        Test.instanceCount += i17;
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
//DEBUG  lMeth ->  lMeth mainTest
//DEBUG  iMeth ->  iMeth lMeth mainTest
//DEBUG  lMeth1 ->  lMeth1 iMeth lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
