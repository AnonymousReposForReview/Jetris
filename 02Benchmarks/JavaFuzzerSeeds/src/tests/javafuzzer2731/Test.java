package tests.javafuzzer2731;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 19:23:52 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-524620634072675559L;
    public static int iFld=-177;
    public static byte byFld=58;
    public static float fFld=118.651F;
    public long lFld=31875L;
    public static float fArrFld[]=new float[N];
    public static double dArrFld[][]=new double[N][N];
    public long lArrFld[][]=new long[N][N];

    static {
        FuzzerUtils.init(Test.fArrFld, -2.332F);
        FuzzerUtils.init(Test.dArrFld, 85.86644);
    }

    public static long lMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static long lMeth(int i2, long l) {

        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, 1.34887);

        i2 += (int)(++dArr[(24734 >>> 1) % N]);
        long meth_res = i2 + l + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth2(int i5, long l1, int i6) {

        int i7=-64190, i8=-164, i9=-203, i10=-3, i11=42964, i12=20566, i13=0, iArr2[]=new int[N];
        boolean b=false, bArr[]=new boolean[N];
        float f1=85.609F, fArr[]=new float[N];
        double d2=-25.41521;
        byte by=0;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 40711L);
        FuzzerUtils.init(bArr, true);
        FuzzerUtils.init(fArr, -72.430F);
        FuzzerUtils.init(iArr2, -12);

        for (i7 = 4; i7 < 251; ++i7) {
            lArr[i7] &= l1;
            for (i9 = 1; i9 < 7; ++i9) {
                bArr[i7 + 1] = b;
                l1 >>= i11;
                fArr = fArr;
                i6 += (i9 ^ (long)f1);
                i6 += (i9 * i9);
                for (i12 = 1; i12 < 2; i12++) {
                    l1 = l1;
                    d2 *= Test.instanceCount;
                    switch ((((Test.iFld >>> 1) % 2) * 5) + 82) {
                    case 83:
                        fArr[i9] = Test.iFld;
                        by += (byte)(i12 + i6);
                        iArr2 = FuzzerUtils.int1array(N, (int)-111);
                        break;
                    case 88:
                        i13 += (int)d2;
                        break;
                    default:
                        i8 += i9;
                    }
                }
            }
        }
        vMeth2_check_sum += i5 + l1 + i6 + i7 + i8 + i9 + i10 + (b ? 1 : 0) + i11 + Float.floatToIntBits(f1) + i12 +
            i13 + Double.doubleToLongBits(d2) + by + FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(bArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(iArr2);
    }

    public static void vMeth1(int i4) {

        short s=18704;
        float f2=-2.765F, f3=-118.981F;
        int i14=-8, i15=-51169, i16=187, iArr3[]=new int[N];
        long l2=-2L;
        boolean b1=true, bArr1[]=new boolean[N];

        FuzzerUtils.init(iArr3, 160);
        FuzzerUtils.init(bArr1, true);

        Test.instanceCount += (i4 * i4);
        vMeth2(-59713, Test.instanceCount, i4);
        Test.iFld = (int)-2675873372032267563L;
        Test.iFld |= s;
        switch (((i4 >>> 1) % 1) + 106) {
        case 106:
            i4 = (int)-4L;
            iArr3[(Test.iFld >>> 1) % N] = (int)f2;
            f3 = 1;
            while (++f3 < 304) {
                for (i14 = (int)(f3); i14 < 5; ++i14) {
                    i4 -= i4;
                }
                for (l2 = (long)(f3); l2 < 5; ++l2) {
                    Test.fArrFld[(int)(l2 - 1)] *= -7537;
                    f2 += (((l2 * Test.iFld) + Test.instanceCount) - i15);
                    bArr1[(int)(f3 - 1)] = b1;
                    Test.byFld = (byte)l2;
                }
            }
            break;
        default:
            i15 -= (int)f3;
        }
        vMeth1_check_sum += i4 + s + Float.floatToIntBits(f2) + Float.floatToIntBits(f3) + i14 + i15 + l2 + i16 + (b1 ?
            1 : 0) + FuzzerUtils.checkSum(iArr3) + FuzzerUtils.checkSum(bArr1);
    }

    public static void vMeth() {

        int i3=-62473, i17=-234, i18=50, i19=-8, iArr1[]=new int[N];
        float f=0.222F;
        long l3=-3691742133482652618L;

        FuzzerUtils.init(iArr1, -48);

        i3 = 1;
        while (++i3 < 302) {
            double d1=-33.125192;
            f += (i3 * ((36750 * Math.max(13L, Test.instanceCount)) - (i3 - i3)));
            Test.iFld += (i3 * i3);
            iArr1[i3 + 1] = (int)(((Test.instanceCount * Test.iFld) - (f + d1)) + 83.21797);
            vMeth1(-54);
            Test.byFld *= (byte)i3;
        }
        for (i17 = 24; 397 > i17; i17++) {
            Test.dArrFld[i17 + 1][i17 + 1] -= Test.iFld;
            Test.iFld |= 6;
            i18 -= (int)f;
            i18 += (int)(3404345318L + (i17 * i17));
        }
        for (l3 = 12; l3 < 219; l3++) {
            Test.iFld = -7125;
            Test.iFld += (int)(-4249482092L + (l3 * l3));
            Test.instanceCount *= i3;
        }
        vMeth_check_sum += i3 + Float.floatToIntBits(f) + i17 + i18 + l3 + i19 + FuzzerUtils.checkSum(iArr1);
    }

    public void mainTest(String[] strArr1) {

        int i=-3, i1=65, i20=-96, i21=148, i22=-3, i23=-3, i24=-20, iArr[]=new int[N];
        double d=1.131055;
        boolean b2=true;
        short s1=1152;

        FuzzerUtils.init(iArr, -8);

        for (i = 20; i < 376; ++i) {
            i1 -= iArr[i];
            i1 += (((i * i) + i1) - i);
            Test.instanceCount *= (long)(d--);
            i1 >>= (int)(((i1 - 19) * i) + lMeth(-(i1 / (i | 1)), i + i));
            Test.instanceCount *= -228;
            i1 = (i1--);
            i1 = Integer.reverseBytes(++i1);
            switch ((((i * i) >>> 1) % 8) + 62) {
            case 62:
                vMeth();
                Test.iFld += i;
            case 63:
                iArr[i] += (int)Test.instanceCount;
                Test.instanceCount = Test.iFld;
                b2 = b2;
                break;
            case 64:
                Test.fFld = s1;
                Test.byFld += (byte)(i ^ Test.iFld);
                Test.instanceCount += (i + Test.instanceCount);
                break;
            case 65:
                for (i20 = 4; i20 < 71; i20++) {
                    for (i22 = 2; 1 < i22; i22 -= 2) {
                        Test.fFld -= i23;
                        i23 = i1;
                        i21 = Test.iFld;
                        Test.instanceCount += i23;
                        Test.instanceCount = Test.instanceCount;
                        iArr[i + 1] = 11;
                        lArrFld[(i20 >>> 1) % N] = lArrFld[i20];
                    }
                    iArr[i20 + 1] = i21;
                    Test.iFld = -12859;
                    Test.instanceCount = s1;
                    Test.fArrFld[i20 - 1] -= Test.fFld;
                }
                break;
            case 66:
                lFld *= (long)Test.fFld;
                break;
            case 67:
                i21 += i24;
                break;
            case 68:
                i24 = -8;
            case 69:
                b2 = b2;
                break;
            default:
                i1 -= (int)lFld;
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
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}