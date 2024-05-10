package tests.javafuzzer1305;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 17:52:09 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=2711298440L;
    public static short sFld=3303;
    public volatile float fArrFld[]=new float[N];
    public double dArrFld[][]=new double[N][N];

    public static long bMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;

    public static float fMeth(boolean b, long l2, int i14) {

        float f2=73.595F;
        int i15=14, i16=26171, i17=39453, i18=-11519, iArr3[]=new int[N];
        double d1=-2.72966;
        boolean bArr[]=new boolean[N];
        long lArr[]=new long[N];
        byte byArr[]=new byte[N];

        FuzzerUtils.init(bArr, false);
        FuzzerUtils.init(lArr, 5407066056589549112L);
        FuzzerUtils.init(iArr3, -139);
        FuzzerUtils.init(byArr, (byte)89);

        i14 += -64326;
        f2 = 1;
        while (++f2 < 393) {
            for (i15 = 1; 4 > i15; i15++) {
                bArr[i15 - 1] = b;
                i17 = 1;
                while (++i17 < 2) {
                    Test.instanceCount -= l2;
                    lArr[i15 - 1] &= Test.instanceCount;
                    switch ((((50773 >>> 1) % 7) * 5) + 81) {
                    case 98:
                        iArr3[(int)(f2)] -= (int)l2;
                        iArr3[(int)(f2 - 1)] = 31667;
                        i16 = i14;
                        break;
                    case 108:
                        i16 += (i17 ^ i16);
                    case 104:
                        i16 -= Test.sFld;
                        lArr[i17] = -59143;
                        d1 += -4784;
                        break;
                    case 102:
                        Test.instanceCount += i17;
                        break;
                    case 111:
                        byArr[i17 - 1] = (byte)i17;
                        break;
                    case 110:
                        Test.sFld += (short)i16;
                        break;
                    case 95:
                        l2 += (((i17 * i17) + i18) - Test.instanceCount);
                        break;
                    default:
                        i18 = 8;
                    }
                }
            }
        }
        long meth_res = (b ? 1 : 0) + l2 + i14 + Float.floatToIntBits(f2) + i15 + i16 + i17 +
            Double.doubleToLongBits(d1) + i18 + FuzzerUtils.checkSum(bArr) + FuzzerUtils.checkSum(lArr) +
            FuzzerUtils.checkSum(iArr3) + FuzzerUtils.checkSum(byArr);
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public static int iMeth(int i11, int i12, int i13) {

        double d=0.107051;
        int i19=1, i20=-31383, i21=-35873, i22=1, iArr2[]=new int[N];

        FuzzerUtils.init(iArr2, 58);

        i11 *= (int)d;
        iArr2[(i11 >>> 1) % N] += (int)Float.intBitsToFloat((int)(i13 * fMeth(true, Test.instanceCount, -13)));
        Test.instanceCount = (long)1.8937;
        for (i19 = 4; i19 < 213; ++i19) {
            i11 = i11;
            i13 -= i11;
            i20 += i19;
            try {
                i13 = (i21 % i12);
                iArr2[i19 - 1] = (i20 % i13);
                i13 = (-248 / i13);
            } catch (ArithmeticException a_e) {}
            Test.instanceCount += Test.instanceCount;
        }
        i20 *= (int)Test.instanceCount;
        i11 &= i12;
        i22 = 1;
        while (++i22 < 157) {
            i13 -= (int)Test.instanceCount;
            i21 = i22;
            iArr2[i22 + 1] += i22;
        }
        long meth_res = i11 + i12 + i13 + Double.doubleToLongBits(d) + i19 + i20 + i21 + i22 +
            FuzzerUtils.checkSum(iArr2);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public boolean bMeth(int i3, long l1, int i4) {

        int i5=-23, i6=37948, i7=-63857, i8=4, i9=-28547, i10=-2, iArr1[]=new int[N];
        byte by=-26;
        float f=2.592F, f1=2.309F;

        FuzzerUtils.init(iArr1, 79);

        i5 = 1;
        do {
            switch (((((i3 * i5) >>> 1) % 1) * 5) + 85) {
            case 88:
                i3 = (int)((i4 = by) + Math.abs(i5 - l1));
                for (i6 = 1; i6 < 5; ++i6) {
                    for (i8 = i6; i8 < 2; i8++) {
                        by = (byte)fArrFld[i6 + 1];
                        i4 += i7;
                        i7 = (++iArr1[i5 - 1]);
                        i4 |= (int)(((i5 / (by | 1)) % (Test.instanceCount | 1)) - ((long)(i3 + f) ^
                            Math.abs(-6679553873003500476L)));
                    }
                    i9 <<= (int)(((i5 - l1) % ((28415 + by) | 1)) + (by--));
                    for (f1 = 1; f1 < 2; ++f1) {
                        switch (((i5 % 5) * 5) + 23) {
                        case 29:
                            i10 -= (int)((++i7) * (by * (3L % (i3 | 1))));
                            break;
                        case 35:
                            iArr1[i5 + 1] ^= (int)((iMeth(i8, i5, i3) - Test.instanceCount) + -17027);
                            i10 += (-33635 + (f1 * f1));
                            break;
                        case 41:
                            i3 = 230;
                            break;
                        case 34:
                            i9 -= (int)l1;
                            break;
                        case 32:
                            by += (byte)-1851073789L;
                            break;
                        default:
                            i7 = i8;
                        }
                    }
                }
                break;
            default:
                i3 -= (int)Test.instanceCount;
            }
        } while (++i5 < 304);
        long meth_res = i3 + l1 + i4 + i5 + by + i6 + i7 + i8 + i9 + Float.floatToIntBits(f) + Float.floatToIntBits(f1)
            + i10 + FuzzerUtils.checkSum(iArr1);
        bMeth_check_sum += meth_res;
        return meth_res % 2 > 0;
    }

    public void mainTest(String[] strArr1) {

        int i=11, i1=242, i2=-88, i23=-14975, i24=121, i25=-48679, i26=227, i27=-79, i28=-37204, i29=8, i30=-4, i31=3,
            iArr[]=new int[N];
        long l=3528876818L, lArr1[]=new long[N];
        float f3=-67.512F, f4=37.847F;
        boolean b1=true;

        FuzzerUtils.init(iArr, 6);
        FuzzerUtils.init(lArr1, -8916L);

        Test.instanceCount = (Test.instanceCount * Long.reverseBytes(-64 + (iArr[(i >>> 1) % N]--)));
        for (i1 = 2; i1 < 203; i1++) {
            l = 1;
            while (++l < 125) {
                if (bMeth(12, Test.instanceCount, i1)) continue;
                i2 = 0;
                lArr1[(int)(l)] = (long)f3;
                iArr[(int)(l + 1)] -= i1;
                Test.sFld ^= (short)Test.instanceCount;
                i2 *= (int)-26.893F;
                f3 = Test.instanceCount;
                lArr1[(int)(l + 1)] -= i2;
                for (i23 = 1; 1 < i23; --i23) {
                    iArr[i23 + 1] = i24;
                }
            }
            dArrFld[i1 + 1][i1 - 1] = f3;
        }
        for (i25 = 7; i25 < 163; i25++) {
            i2 += i25;
            for (i27 = 10; i27 < 161; i27++) {
                f3 %= ((long)(f3) | 1);
                i2 *= (int)f3;
            }
            for (i29 = 10; i29 < 161; i29++) {
                for (f4 = 1; f4 < 2; f4++) {
                    f3 = i2;
                    iArr[i25 - 1] = i26;
                    switch ((i25 % 8) + 27) {
                    case 27:
                        i = (int)l;
                        dArrFld[i25][i25 + 1] -= f4;
                        if (b1) break;
                        break;
                    case 28:
                        i30 *= (int)f4;
                        Test.instanceCount >>>= i29;
                        Test.instanceCount += (long)(f4 - i2);
                    case 29:
                        iArr[i25 + 1] -= -3;
                        break;
                    case 30:
                        i28 |= -47815;
                        break;
                    case 31:
                        iArr = iArr;
                    case 32:
                        if (b1) continue;
                        break;
                    case 33:
                        i30 = Test.sFld;
                        break;
                    case 34:
                        i30 = (int)Test.instanceCount;
                        break;
                    default:
                        f3 += (f4 * f4);
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
//DEBUG  bMeth ->  bMeth mainTest
//DEBUG  iMeth ->  iMeth bMeth mainTest
//DEBUG  fMeth ->  fMeth iMeth bMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
