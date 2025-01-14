package tests.javafuzzer896;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 11:24:14 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=204L;
    public static byte byFld=-96;
    public static double dFld=22.2078;
    public float fFld=-62.722F;
    public static boolean bFld=false;
    public short sFld=-2310;
    public static volatile int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -10);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i9) {

        int i10=-10, i11=-38886, i12=23753, i13=186, i14=-116, i15=26880;
        short s=29868;
        float f1=105.635F;

        i10 = 1;
        while (++i10 < 345) {
            i9 -= i10;
            for (i11 = i10; i11 < 5; i11++) {
                i9 -= 31768;
            }
            Test.instanceCount += -161;
            Test.instanceCount = s;
        }
        f1 /= (i12 | 1);
        i13 = 1;
        while (++i13 < 262) {
            Test.instanceCount += (i13 * i13);
            for (i14 = 6; 1 < i14; i14 -= 2) {
                i9 += (((i14 * i9) + i12) - i12);
                f1 = 6767741402013407924L;
                f1 += i14;
                i12 = i14;
            }
            Test.instanceCount = i13;
        }
        vMeth1_check_sum += i9 + i10 + i11 + i12 + s + Float.floatToIntBits(f1) + i13 + i14 + i15;
    }

    public static void vMeth(int i2, float f) {

        int i3=230, i4=4717, i5=-9, i6=-37938, i7=12, i8=14, i16=49400, iArr[][]=new int[N][N];
        short s1=-13012;
        double dArr[][]=new double[N][N];
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr, 11);
        FuzzerUtils.init(dArr, 0.26220);
        FuzzerUtils.init(lArr, -3748024197L);

        for (i3 = 8; 129 > i3; i3++) {
            for (i5 = i3; i5 < 13; i5++) {
                i6 *= i2;
                for (i7 = i3; 1 > i7; i7 += 3) {
                    vMeth1(i7);
                }
                iArr = FuzzerUtils.int2array(N, (int)7);
                i4 -= (int)1.915F;
                i8 *= i2;
                i2 = (int)-212L;
                i16 = 1;
                do {
                    i8 = s1;
                    Test.instanceCount += (((i16 * i6) + Test.byFld) - i5);
                    iArr[i5][i16] += i2;
                    dArr[i16][i16] = 15;
                    lArr[i3 - 1] = i6;
                } while (++i16 < 1);
            }
        }
        vMeth_check_sum += i2 + Float.floatToIntBits(f) + i3 + i4 + i5 + i6 + i7 + i8 + i16 + s1 +
            FuzzerUtils.checkSum(iArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) +
            FuzzerUtils.checkSum(lArr);
    }

    public int iMeth() {

        int i17=15943, i18=5260, i19=-92, i20=-48115, i21=12;
        long l=-2290986427L, lArr1[][]=new long[N][N];
        boolean bArr[]=new boolean[N];
        float fArr[]=new float[N];

        FuzzerUtils.init(lArr1, -7471157101064444055L);
        FuzzerUtils.init(bArr, false);
        FuzzerUtils.init(fArr, 116.760F);

        vMeth(i17, 72.277F);
        i17 *= (int)Test.dFld;
        i18 = 1;
        while (++i18 < 272) {
            Test.instanceCount *= Test.instanceCount;
            for (l = i18; 6 > l; l++) {
                lArr1 = lArr1;
                for (i20 = i18; i20 < 1; ++i20) {
                    i19 -= 0;
                    i19 = (int)fFld;
                    fFld *= Test.instanceCount;
                    Test.iArrFld[i18] %= (int)(i18 | 1);
                    i17 >>= (int)Test.instanceCount;
                    bArr[(int)(l)] = Test.bFld;
                    i19 = i21;
                    fArr[(int)(l)] += fFld;
                }
            }
        }
        long meth_res = i17 + i18 + l + i19 + i20 + i21 + FuzzerUtils.checkSum(lArr1) + FuzzerUtils.checkSum(bArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=27528, i1=-11, i22=23551, i23=-13, i24=-24378, i26=-7, i27=-100, i28=-8;
        long l1=3L, lArr2[]=new long[N];
        float fArr1[]=new float[N];

        FuzzerUtils.init(lArr2, 5L);
        FuzzerUtils.init(fArr1, -5.889F);

        for (i = 9; i < 173; ++i) {
            i1 |= (int)(iMeth() - fFld);
            i1 += (i * i);
            lArr2[i - 1] -= i1;
        }
        Test.iArrFld[(i >>> 1) % N] = i1;
        Test.iArrFld[(-145 >>> 1) % N] -= i22;
        Test.iArrFld[(-175 >>> 1) % N] *= (int)Test.instanceCount;
        lArr2 = lArr2;
        fFld *= -13L;
        for (i23 = 17; 366 > i23; i23++) {
            if (Test.bFld) break;
            i24 = Test.byFld;
            fFld += (60205 + (i23 * i23));
            sFld = (short)i;
            switch ((i23 % 10) + 110) {
            case 110:
                i24 /= (int)(i23 | 1);
                i1 = i;
                break;
            case 111:
                i1 = i23;
                for (l1 = 1; l1 < 72; l1++) {
                    if (false) continue;
                    Test.iArrFld[i23] = i1;
                    Test.instanceCount = Test.instanceCount;
                    for (i27 = 1; i27 < 2; ++i27) {
                        switch ((i23 % 1) + 113) {
                        case 113:
                            fFld += i27;
                        default:
                            i28 = i1;
                            Test.dFld *= i26;
                            Test.iArrFld = Test.iArrFld;
                            i26 >>= -40;
                        }
                        i24 = -24303;
                    }
                }
                break;
            case 112:
                fFld = fFld;
                break;
            case 113:
                sFld = (short)i24;
                break;
            case 114:
                Test.instanceCount += i22;
                break;
            case 115:
                fArr1[i23] = 94L;
            case 116:
                Test.instanceCount += (i23 * Test.instanceCount);
                break;
            case 117:
                i26 %= (int)(i26 | 1);
                break;
            case 118:
                fFld += i24;
                break;
            case 119:
                Test.byFld = (byte)i27;
                break;
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
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
