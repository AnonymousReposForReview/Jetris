package tests.javafuzzer3351;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 06:37:48 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-757189872813895811L;
    public static short sFld=6853;
    public int iFld=-16586;
    public volatile long lArrFld[]=new long[N];

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(int i3, int i4, double d1) {

        long l=-1L, lArr[]=new long[N];
        float f1=2.251F;
        int i5=4, i6=-203, i7=-46173, i8=54071, iArr1[]=new int[N];
        boolean bArr[]=new boolean[N];

        FuzzerUtils.init(iArr1, -281);
        FuzzerUtils.init(lArr, -88204513390736113L);
        FuzzerUtils.init(bArr, true);

        l = 1;
        do {
            switch ((int)(((l % 9) * 5) + 29)) {
            case 64:
                f1 += (l * l);
                iArr1[(int)(l + 1)] *= (int)-1630894180896131148L;
                lArr[(int)(l - 1)] += -36678;
                for (i5 = 1; 9 > i5; ++i5) {
                    i6 = (int)l;
                    Test.instanceCount -= (long)f1;
                    i6 += (i5 | Test.instanceCount);
                    Test.instanceCount = 7;
                    f1 -= (float)d1;
                }
                break;
            case 31:
                for (i7 = (int)(l); i7 < 9; ++i7) {
                    bArr = bArr;
                    lArr = lArr;
                    i3 += i6;
                }
                break;
            case 68:
                i4 += (int)(((l * i5) + i6) - f1);
                break;
            case 63:
                iArr1[(int)(l)] = i7;
                break;
            case 35:
                iArr1[(int)(l)] -= i4;
            case 42:
                Test.instanceCount += (long)d1;
                break;
            case 56:
                i8 = (int)246L;
                break;
            case 67:
                iArr1[(int)(l - 1)] &= 13;
            case 50:
                i8 += (int)(l * l);
            }
        } while (++l < 170);
        vMeth2_check_sum += i3 + i4 + Double.doubleToLongBits(d1) + l + Float.floatToIntBits(f1) + i5 + i6 + i7 + i8 +
            FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(bArr);
    }

    public static void vMeth1() {

        int i1=12, i2=13, iArr[]=new int[N];
        double d=0.80277;

        FuzzerUtils.init(iArr, 14032);

        i1 = 1;
        do {
            i2 += i2;
            iArr[i1 + 1] = (int)(d++);
        } while (++i1 < 218);
        vMeth2(i1, i2, d);
        i2 = i2;
        vMeth1_check_sum += i1 + i2 + Double.doubleToLongBits(d) + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth(byte by, int i, short s) {

        float f=-2.804F;
        int i9=124, i10=7, i11=145, i12=13, i13=34275, i14=1, iArr2[]=new int[N];
        boolean b=false;

        FuzzerUtils.init(iArr2, 5);

        f = f;
        vMeth1();
        for (i9 = 3; 223 > i9; ++i9) {
            i = (int)Test.instanceCount;
            i10 /= (int)(i10 | 1);
            Test.instanceCount = -1187835605L;
            i10 += (int)Test.instanceCount;
            for (i11 = 1; i11 < 7; i11++) {
                by = (byte)i12;
                i *= 192;
                for (i13 = i9; i13 < 2; ++i13) {
                    iArr2[i13 + 1] = i13;
                    i14 += (((i13 * i12) + Test.instanceCount) - i9);
                    if (b) break;
                    if (i != 0) {
                        vMeth_check_sum += by + i + s + Float.floatToIntBits(f) + i9 + i10 + i11 + i12 + i13 + i14 + (b
                            ? 1 : 0) + FuzzerUtils.checkSum(iArr2);
                        return;
                    }
                }
            }
        }
        vMeth_check_sum += by + i + s + Float.floatToIntBits(f) + i9 + i10 + i11 + i12 + i13 + i14 + (b ? 1 : 0) +
            FuzzerUtils.checkSum(iArr2);
    }

    public void mainTest(String[] strArr1) {

        byte by1=-98;
        int i15=89, i16=24066, i17=179, i18=11, i19=22906, i20=-196, i21=-187, i22=4519, iArr3[]=new int[N];
        float f2=-22.291F, f3=0.916F, fArr[][]=new float[N][N];
        long l1=-10L;
        double d2=-77.108678;

        FuzzerUtils.init(fArr, -96.629F);
        FuzzerUtils.init(iArr3, -44795);

        vMeth(by1, i15, Test.sFld);
        for (i16 = 1; i16 < 151; i16++) {
            i15 += (int)f2;
            Test.sFld = (short)Test.instanceCount;
            i17 = i17;
            for (i18 = 167; 3 < i18; --i18) {
                i17 = i17;
                for (i20 = 2; i20 > 1; i20--) {
                    i19 += -152;
                }
                if (true) break;
            }
            lArrFld[i16] *= 3;
            i19 = iFld;
            i15 = i15;
            for (f3 = 3; 167 > f3; f3++) {
                i17 -= i21;
                l1 = 1;
                while (++l1 < 2) {
                    fArr[(int)(l1)][i16 + 1] += i15;
                    switch ((i16 % 7) + 12) {
                    case 12:
                        try {
                            i19 = (iArr3[i16 - 1] % 210);
                            iArr3[(int)(l1)] = (-6526 % i19);
                            iArr3[(int)(f3 - 1)] = (iArr3[(int)(l1 - 1)] % i21);
                        } catch (ArithmeticException a_e) {}
                        i19 <<= (int)l1;
                        iArr3[(i20 >>> 1) % N] = 0;
                        Test.sFld *= (short)i19;
                    case 13:
                        i22 += (int)f3;
                    case 14:
                        i21 += (int)l1;
                    case 15:
                        Test.instanceCount >>= i20;
                        i22 = i19;
                        i22 *= (int)l1;
                    case 16:
                        Test.instanceCount += i22;
                        break;
                    case 17:
                        Test.sFld = (short)Test.instanceCount;
                        d2 += 6371;
                        break;
                    case 18:
                        iArr3[(int)(l1 - 1)] -= by1;
                    default:
                        i15 += (-162 + (l1 * l1));
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
