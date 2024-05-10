package tests.javafuzzer2123;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 09:13:00 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=3420208631L;
    public float fFld=-2.192F;
    public static boolean bFld=false;
    public short sFld=11805;
    public static long lArrFld[][]=new long[N][N];
    public byte byArrFld[]=new byte[N];
    public static long lArrFld1[]=new long[N];
    public int iArrFld[][]=new int[N][N];

    static {
        FuzzerUtils.init(Test.lArrFld, 6438444352391120803L);
        FuzzerUtils.init(Test.lArrFld1, -14L);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i12) {

        int i13=-10, i14=-185, i15=-25019, i16=-12207, iArr[]=new int[N];
        boolean b=false;
        double d=-71.130033, dArr[][]=new double[N][N];
        float f1=0.619F, fArr[][]=new float[N][N];

        FuzzerUtils.init(iArr, 51046);
        FuzzerUtils.init(dArr, -2.34884);
        FuzzerUtils.init(fArr, -71.582F);

        i12 *= (int)7L;
        i12 += i12;
        for (i13 = 12; i13 < 295; i13++) {
            Test.instanceCount = Test.instanceCount;
            i14 %= (int)(Test.instanceCount | 1);
        }
        for (i15 = 18; i15 < 382; i15++) {
            b = b;
            i14 = i14;
            switch ((i15 % 4) + 20) {
            case 20:
                iArr = FuzzerUtils.int1array(N, (int)9);
                d = 1;
                while ((d += 2) < 5) {
                    i12 += (int)d;
                    f1 %= (i13 | 1);
                    dArr[i15 - 1][(int)(d)] -= Test.instanceCount;
                    iArr[(int)(d)] *= (int)Test.instanceCount;
                }
                break;
            case 21:
                i16 += (((i15 * i15) + i16) - i13);
                break;
            case 22:
                fArr[i15][i15] -= (float)d;
                break;
            case 23:
                i12 += (i15 | i13);
                break;
            }
        }
        vMeth1_check_sum += i12 + i13 + i14 + i15 + i16 + (b ? 1 : 0) + Double.doubleToLongBits(d) +
            Float.floatToIntBits(f1) + FuzzerUtils.checkSum(iArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr))
            + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static void vMeth(int i9, int i10, int i11) {

        int i17=-15, i18=32376, i19=5, i20=-10, i21=41110, i22=88, i23=5349, i24=-19078;
        double d1=1.38414;
        float f2=27.875F;

        vMeth1(i9);
        for (i17 = 5; i17 < 154; ++i17) {
            for (i19 = 1; i19 < 11; i19 += 2) {
                d1 *= i20;
                i10 += (i19 * i20);
                i10 -= i9;
                i20 = i17;
                i20 = -53202;
            }
            Test.instanceCount <<= i11;
            for (i21 = i17; 11 > i21; ++i21) {
                boolean b1=true;
                Test.instanceCount = 16179;
                for (f2 = 1; f2 < 1; ++f2) {
                    i20 -= (int)Test.instanceCount;
                    i24 = (int)Test.instanceCount;
                }
                if (b1) break;
            }
        }
        vMeth_check_sum += i9 + i10 + i11 + i17 + i18 + i19 + i20 + Double.doubleToLongBits(d1) + i21 + i22 +
            Float.floatToIntBits(f2) + i23 + i24;
    }

    public int iMeth() {

        int i6=-14, i7=-519, i8=-55855, i25=-7, i26=210, i27=-99, i28=9, iArr1[]=new int[N];
        short s=31517;

        FuzzerUtils.init(iArr1, 206);

        Test.instanceCount = (((i6 - i6) + (-108L >>> Math.max(153009705L, Test.instanceCount))) - s);
        if (Test.bFld) {
            i6 += (i6 * (Math.min(i6, i6) * Math.min(-40, i6)));
            i6 %= (int)(i6 | 1);
        } else if (Test.bFld) {
            i6 = i6;
            for (i7 = 5; i7 < 387; ++i7) {
                switch ((i7 % 9) + 63) {
                case 63:
                    Test.lArrFld[i7] = (Test.lArrFld[i7] = (Test.lArrFld[i7] = (Test.lArrFld[i7] = Test.lArrFld[i7 +
                        1])));
                    vMeth(40, i6, i8);
                    for (i25 = 1; i25 < 4; i25++) {
                        i26 &= i6;
                        for (i27 = 1; i27 < 2; ++i27) {
                            i6 = -36;
                            fFld -= -13;
                            i6 = -6;
                        }
                    }
                    break;
                case 64:
                    Test.instanceCount -= i8;
                    break;
                case 65:
                    iArr1[i7] *= i27;
                    break;
                case 66:
                    fFld *= i25;
                    break;
                case 67:
                    byArrFld[i7 + 1] ^= (byte)i7;
                    break;
                case 68:
                case 69:
                    fFld -= i25;
                case 70:
                    i26 = i6;
                case 71:
                    Test.instanceCount += (((i7 * i6) + Test.instanceCount) - i8);
                    break;
                }
            }
        }
        long meth_res = i6 + s + i7 + i8 + i25 + i26 + i27 + i28 + FuzzerUtils.checkSum(iArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-106, i1=14, i2=1, i3=3, i4=11, i5=142, i29=9, i30=-1, i31=13;
        float f=1.7F;
        double d2=125.74784;
        boolean bArr[]=new boolean[N];

        FuzzerUtils.init(bArr, false);

        for (i = 11; i < 188; ++i) {
            for (i2 = 6; i2 < 142; i2++) {
                Test.instanceCount = Test.lArrFld[i2 - 1][i2];
                f *= 0.466F;
                switch (((i % 1) * 5) + 119) {
                case 121:
                    for (i4 = 1; i4 < 2; ++i4) {
                        i1 >>>= iMeth();
                        Test.instanceCount += i4;
                        Test.instanceCount = i4;
                        fFld *= sFld;
                        i1 += i4;
                        Test.instanceCount = -7;
                    }
                    fFld -= i2;
                    i29 = 1;
                    do {
                        i5 -= -16955;
                        Test.instanceCount = i2;
                        d2 = 1270887708007610692L;
                    } while (++i29 < 2);
                    Test.instanceCount = i3;
                    break;
                }
                i3 = (int)Test.instanceCount;
                bArr[i2 - 1] = true;
                i1 <<= i5;
                for (i30 = 1; i30 < 2; i30 += 3) {
                    iArrFld = iArrFld;
                    iArrFld[i2][i2] *= (int)fFld;
                    Test.instanceCount = i31;
                    i3 -= (int)Test.instanceCount;
                    i5 += (i30 - Test.instanceCount);
                    i5 <<= i4;
                }
            }
            iArrFld = iArrFld;
            d2 -= 114.17514;
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
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
