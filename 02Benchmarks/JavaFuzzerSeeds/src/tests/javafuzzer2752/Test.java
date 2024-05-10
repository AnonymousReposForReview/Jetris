package tests.javafuzzer2752;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 19:49:19 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=82L;
    public short sFld=27764;
    public float fFld=1.145F;
    public static volatile float fFld1=-2.144F;
    public boolean bFld=true;
    public static float fArrFld[]=new float[N];
    public short sArrFld[]=new short[N];
    public long lArrFld[]=new long[N];
    public boolean bArrFld[][]=new boolean[N][N];

    static {
        FuzzerUtils.init(Test.fArrFld, 28.204F);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public static long lMeth(int i6, long l1) {

        int i7=5, i8=45940, i9=12, i10=-706, i11=2, i12=-32028, i13=-198, i14=-2, i15=-3, iArr1[]=new int[N];
        short s=25062;
        float f=1.599F;
        double d=0.12319;
        byte by2=127;

        FuzzerUtils.init(iArr1, -184);

        for (i7 = 18; i7 < 371; i7++) {
            for (i9 = i7; i9 < 5; ++i9) {
                iArr1[i9] >>= (int)-6L;
                s += (short)(((i9 * l1) + i8) - l1);
            }
            i10 <<= i9;
            i8 -= i9;
            for (i11 = 1; 5 > i11; i11++) {
                i12 *= (int)f;
                l1 += i11;
                for (i13 = 1; i13 < 2; ++i13) {
                    i10 += (i13 ^ i7);
                    if (false) break;
                }
                l1 = i6;
                d += by2;
                Test.instanceCount += (((i11 * i14) + i15) - i6);
            }
        }
        long meth_res = i6 + l1 + i7 + i8 + i9 + i10 + s + i11 + i12 + Float.floatToIntBits(f) + i13 + i14 +
            Double.doubleToLongBits(d) + by2 + i15 + FuzzerUtils.checkSum(iArr1);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void vMeth(long l) {

        int i3=39920, i4=29311, i5=-6, i16=-4, i17=57, iArr[]=new int[N];
        byte by1=45;
        boolean bArr[]=new boolean[N];
        double dArr[]=new double[N];

        FuzzerUtils.init(bArr, false);
        FuzzerUtils.init(iArr, 4);
        FuzzerUtils.init(dArr, -62.80554);

        sFld = (short)i3;
        i3 = (int)((i3--) + -4187466928L);
        for (i4 = 8; i4 < 197; ++i4) {
            i5 -= (int)(((long)(fFld * 112L) << (i5 - i3)) + Test.instanceCount);
            i5 -= (int)(l++);
            bArr[i4 - 1] = (((-(sFld - i4)) - (i5 * i3)) != ((-12324 + Test.instanceCount) + (-(Test.fArrFld[i4] +=
                by1))));
            Test.instanceCount += (-5764 + (i4 * i4));
            Test.instanceCount %= ((iArr[i4 + 1]++) | 1);
            i3 += (int)lMeth(i3, l);
            switch ((i4 % 1) + 21) {
            case 21:
                sArrFld[i4 - 1] >>= (short)i5;
                i3 += (-14 + (i4 * i4));
                for (i16 = 1; i16 < 8; ++i16) {
                    dArr[i4 + 1] = i4;
                    iArr[i16 + 1] = i3;
                }
            }
        }
        vMeth_check_sum += l + i3 + i4 + i5 + by1 + i16 + i17 + FuzzerUtils.checkSum(bArr) + FuzzerUtils.checkSum(iArr)
            + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public int iMeth(byte by, int i1, int i2) {

        int i18=-60119, i19=-4, i20=-76, i21=-1627, i22=-151, iArr2[]=new int[N];
        boolean b=true;

        FuzzerUtils.init(iArr2, -107);

        if (true) {
            vMeth(Test.instanceCount);
            for (i18 = 5; i18 < 243; ++i18) {
                Test.instanceCount -= Test.instanceCount;
                i20 = 1;
                do {
                    for (i21 = 1; 1 > i21; i21++) {
                        iArr2[i21 + 1] -= (int)fFld;
                        iArr2[i21] <<= sFld;
                        i19 -= (int)fFld;
                        Test.instanceCount += i21;
                        sFld &= (short)i1;
                        Test.instanceCount = Test.instanceCount;
                        Test.instanceCount += i19;
                        by += (byte)(((i21 * i22) + sFld) - Test.instanceCount);
                        iArr2 = iArr2;
                    }
                } while (++i20 < 7);
            }
        } else if (b) {
            fFld += Test.fFld1;
        } else if (b) {
            i2 |= (int)Test.instanceCount;
        } else {
            Test.instanceCount = i2;
        }
        long meth_res = by + i1 + i2 + i18 + i19 + i20 + i21 + i22 + (b ? 1 : 0) + FuzzerUtils.checkSum(iArr2);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=3, i24=10, i25=-14, i26=94, i27=16661, i29=-3, i30=8, i31=24753, iArr3[]=new int[N];
        byte by3=-10;
        double d1=1.20359, d2=-71.111500, dArr1[]=new double[N];

        FuzzerUtils.init(iArr3, 207);
        FuzzerUtils.init(dArr1, 0.130547);

        Test.instanceCount &= i;
        i += iMeth(by3, i, i);
        i -= i;
        iArr3[(i >>> 1) % N] = i;
        i *= (int)Test.instanceCount;
        for (i24 = 1; i24 < 390; i24++) {
            for (i26 = 2; i26 < 65; ++i26) {
                switch (((i24 % 2) * 5) + 32) {
                case 33:
                    if (bFld) continue;
                    i >>>= (int)Test.instanceCount;
                    break;
                case 37:
                    Test.instanceCount += (176 + (i26 * i26));
                    dArr1[i26 + 1] = -243;
                    Test.instanceCount -= i;
                }
                i25 += i26;
            }
            fFld += i24;
        }
        lArrFld[(i26 >>> 1) % N] += Test.instanceCount;
        for (int i28 : iArr3) {
            switch (((50 >>> 1) % 6) + 106) {
            case 106:
                for (d1 = 2; 63 > d1; ++d1) {
                    for (i30 = 1; i30 < 2; i30++) {
                        iArr3[(int)(d1)] |= i30;
                        Test.instanceCount *= Test.instanceCount;
                        i27 &= i26;
                        Test.fFld1 += (((i30 * Test.instanceCount) + fFld) - i25);
                        i28 = i29;
                        if (bFld) break;
                        Test.instanceCount = 232L;
                        d2 = i26;
                        Test.fFld1 += (i30 - i31);
                        d2 -= sFld;
                    }
                }
            case 107:
                iArr3[(-23 >>> 1) % N] -= i29;
                break;
            case 108:
                i27 <<= i;
                break;
            case 109:
                iArr3[(i >>> 1) % N] += (int)Test.instanceCount;
                break;
            case 110:
                bArrFld[(i24 >>> 1) % N][(i29 >>> 1) % N] = bFld;
                break;
            case 111:
                i29 -= i29;
            default:
                i31 *= i27;
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
//DEBUG  lMeth ->  lMeth vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
