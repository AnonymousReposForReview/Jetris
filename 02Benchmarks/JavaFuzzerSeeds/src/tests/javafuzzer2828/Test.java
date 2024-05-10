package tests.javafuzzer2828;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 21:02:21 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-30L;
    public static volatile boolean bFld=true;
    public static float fFld=-116.895F;
    public short sFld=-12425;
    public static double dFld=-1.64023;
    public static float fArrFld[]=new float[N];
    public static int iArrFld[]=new int[N];
    public byte byArrFld[]=new byte[N];

    static {
        FuzzerUtils.init(Test.fArrFld, -106.781F);
        FuzzerUtils.init(Test.iArrFld, -4);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(int i5, byte by) {

        int i6=3, i7=1, i8=36399, i9=-35408, i10=-37105, i11=1, iArr1[]=new int[N];
        short s=-22798;
        float fArr[][]=new float[N][N];
        double dArr[]=new double[N];

        FuzzerUtils.init(iArr1, -10);
        FuzzerUtils.init(fArr, 0.677F);
        FuzzerUtils.init(dArr, 0.48344);

        for (i6 = 5; i6 < 267; i6++) {
            iArr1[i6 + 1] -= i5;
            i7 += s;
            fArr[i6 + 1][i6 + 1] *= i5;
        }
        for (i8 = 13; i8 < 367; ++i8) {
            i9 += i8;
            i5 = i6;
            Test.instanceCount = i6;
            for (i10 = 1; i10 < 5; i10++) {
                long l3=-2L;
                Test.instanceCount = 2;
                dArr[i8] -= i7;
                i5 &= (int)Test.instanceCount;
                iArr1[i8] -= i10;
                i11 += (i10 * i10);
                i11 += (((i10 * l3) + i5) - Test.instanceCount);
            }
        }
        vMeth2_check_sum += i5 + by + i6 + i7 + s + i8 + i9 + i10 + i11 + FuzzerUtils.checkSum(iArr1) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static void vMeth1(int i1, long l2, int i2) {

        float f1=-3.139F, fArr1[]=new float[N];
        int i3=-18276, i4=249, i12=-56, i13=47455, i14=-56873, i15=6, iArr[][]=new int[N][N];
        byte by1=-19;
        short s1=-29252, sArr[][]=new short[N][N];
        boolean b=true;
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr, -13384);
        FuzzerUtils.init(sArr, (short)-29589);
        FuzzerUtils.init(lArr, -161L);
        FuzzerUtils.init(fArr1, 0.847F);

        f1 += (++iArr[(i2 >>> 1) % N][(i1 >>> 1) % N]);
        sArr = sArr;
        for (i3 = 3; 311 > i3; i3++) {
            f1 += (i3 * f1);
            i4 = (int)(((200 >> (Test.instanceCount - i3)) * i4) >>> lArr[i3]);
            vMeth2(i4, by1);
            fArr1[i3 - 1] += 62781;
            i4 += i1;
            for (i12 = 1; 5 > i12; i12++) {
                for (i14 = 2; i14 > i3; i14--) {
                    i4 <<= s1;
                    i1 <<= i14;
                    by1 = (byte)i15;
                    if (b) continue;
                    f1 = i4;
                }
            }
        }
        vMeth1_check_sum += i1 + l2 + i2 + Float.floatToIntBits(f1) + i3 + i4 + by1 + i12 + i13 + i14 + i15 + s1 + (b ?
            1 : 0) + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(sArr) + FuzzerUtils.checkSum(lArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1));
    }

    public static void vMeth(long l, float f, long l1) {

        int i=-35618, i16=245, i17=-34828, i18=-200, i19=38976, i20=-19775, iArr2[]=new int[N];
        double d=0.32917, dArr1[][]=new double[N][N];
        short s2=20292;
        long lArr1[]=new long[N];

        FuzzerUtils.init(dArr1, -1.46645);
        FuzzerUtils.init(lArr1, 160L);
        FuzzerUtils.init(iArr2, 13414);

        i = Math.abs(i);
        i += (i++);
        vMeth1(i, Test.instanceCount, 5);
        i16 = 1;
        do {
            for (i17 = 1; 7 > i17; i17++) {
                i18 -= i;
                for (i19 = 2; i19 > 1; --i19) {
                    if (Test.bFld) {
                        i20 = i16;
                    } else {
                        f = 10;
                    }
                    dArr1[i19][i17] -= d;
                    if (Test.bFld) {
                        s2 -= (short)l;
                        lArr1[i19] <<= -66;
                        Test.fArrFld[i19] = f;
                    } else if (true) {
                        iArr2 = iArr2;
                    } else {
                        d = i19;
                    }
                }
            }
        } while (++i16 < 249);
        vMeth_check_sum += l + Float.floatToIntBits(f) + l1 + i + i16 + i17 + i18 + i19 + i20 +
            Double.doubleToLongBits(d) + s2 + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr1)) +
            FuzzerUtils.checkSum(lArr1) + FuzzerUtils.checkSum(iArr2);
    }

    public void mainTest(String[] strArr1) {

        int i21=-7698, i22=5, i23=242, i24=82, i25=47408;
        byte by2=-9;
        long l4=244L;

        vMeth(Test.instanceCount, Test.fFld, Test.instanceCount);
        Test.bFld = Test.bFld;
        i21 /= (int)((long)(Test.fFld) | 1);
        i21 += (int)Test.instanceCount;
        i21 = sFld;
        i22 = 1;
        while (++i22 < 361) {
            by2 |= (byte)i22;
            Test.instanceCount += -8;
            for (i23 = 2; i23 < 70; ++i23) {
                l4 = 1;
                do {
                    Test.iArrFld[i23 - 1] -= i23;
                    i21 &= (int)Test.instanceCount;
                    i24 *= i22;
                    byArrFld[(int)(l4 + 1)] += (byte)i24;
                    i21 += (int)(l4 | i22);
                    i24 += (int)(((l4 * Test.instanceCount) + i22) - i24);
                    i21 -= (int)Test.instanceCount;
                    Test.dFld = i23;
                } while (++l4 < 2);
                i21 += i23;
                i24 = (int)Test.fFld;
                i24 = (int)l4;
            }
            i24 = i22;
        }
        i25 = 1;
        while (++i25 < 250) {
            Test.instanceCount = 9245;
            Test.instanceCount |= Test.instanceCount;
            Test.dFld += Test.dFld;
            Test.fFld = i21;
            Test.dFld -= -224836740L;
            Test.dFld += -1597409857L;
            i21 = (int)Test.instanceCount;
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
